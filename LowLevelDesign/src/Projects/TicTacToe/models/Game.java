package Projects.TicTacToe.models;

import Projects.TicTacToe.exceptions.DuplicateSymbolException;
import Projects.TicTacToe.exceptions.MoreThanOneBotException;
import Projects.TicTacToe.exceptions.PlayersCountDimensionMismatchException;
import Projects.TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
    private final ArrayList<Object> moves;
    private List<Player> players;
    private Board board;
    private List<WinningStrategy> winningStrategies;
    private int nextMovePlayerIndex;
    private Player winner;
    private GameState gameState;

    private Game(int dimensions, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.nextMovePlayerIndex = 0;
        this.gameState = GameState.IN_PROGRESS;
        this.moves = new ArrayList<>();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;
        private int dimensions;

        public Builder setDimension(int dimention) {
            this.dimensions = dimention;
            return this;
        }

        public  Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        // addPlayer is a better alternative to setPlayers
        public Builder addPlayer(Player player) {
            this.players.add(player);
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        // addWinningStrategy is a better alternative to setWinningStrategies
        public Builder addWinningStrategy(WinningStrategy winningStrategy) {
            this.winningStrategies.add(winningStrategy);
            return this;
        }

        public Game build()
                throws DuplicateSymbolException, PlayersCountDimensionMismatchException, MoreThanOneBotException {
            validateInputs();
            return new Game(dimensions, players, winningStrategies);
        }

        private void validateInputs()
                throws MoreThanOneBotException, PlayersCountDimensionMismatchException, DuplicateSymbolException {
            validateBotCounts();
            validateDimensionsAndPlayersCount();
            validateUniqueSymbolsForPlayers();
        }

        private void validateBotCounts() throws MoreThanOneBotException {
            int botCount = 0;
            for (Player player: players) {
                if (player.getPlayerType().equals(PlayerType.BOT)) {
                    botCount++;
                }
            }

            if (botCount > 1) {
                throw new MoreThanOneBotException();
            }
        }

        private void validateDimensionsAndPlayersCount() throws PlayersCountDimensionMismatchException {
            if (players.size() != dimensions - 1) {
                throw new PlayersCountDimensionMismatchException();
            }
        }

        private void validateUniqueSymbolsForPlayers() throws DuplicateSymbolException {
            Map<Character, Integer> symbolCounts = new HashMap<>();
            for (Player player: players) {
                if (!symbolCounts.containsKey(player.getSymbol().getaChar())) {
                    symbolCounts.put(player.getSymbol().getaChar(), 0);
                }

                symbolCounts.put(
                        player.getSymbol().getaChar(),
                        symbolCounts.get(player.getSymbol().getaChar() + 1)
                );

                if (symbolCounts.get(player.getSymbol().getaChar()) > 1) {
                    throw new DuplicateSymbolException();
                }
            }
        }
    }
}
