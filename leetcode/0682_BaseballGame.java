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
