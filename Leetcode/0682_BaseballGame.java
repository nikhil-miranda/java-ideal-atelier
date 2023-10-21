/**
 * Number: 682
 * Title: Baseball Game
 * Question: You are keeping the scores for a baseball game with strange rules.
 * At the beginning of the game, you start with an empty record.
 * You are given a list of strings operations, where operations[i] is the ith
 * operation you must apply to the record and is one of the following:
 *
 * Test Case 1: [1,2,1]
 * Test Case 2: [1,3,2,1]
 */

class Solution {
    public int calPoints(String[] operations) {

        int n = operations.length;
        int finalScore = 0;
        List<Integer> newOperations = new ArrayList();

        for (int i = 0; i < n; i++) {
            switch (operations[i]) {
                case "+":
                    newOperations.add(newOperations.get(newOperations.size() - 1) + newOperations.get(newOperations.size() - 2));
                    break;
                case "C":
                    newOperations.remove(newOperations.size() - 1);
                    break;
                case "D":
                    newOperations.add(newOperations.get(newOperations.size() - 1) * 2);
                    break;
                default:
                    newOperations.add(Integer.parseInt(operations[i]));
                    break;
            }
        }

        for (int i = 0; i < newOperations.size(); i++) {
            finalScore += newOperations.get(i);
        }
        return finalScore;
    }
}
