class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<Integer> safeNodes = new ArrayList<Integer>();

        for(int i = 0; i < graph.length; i++) {
            if(graph[i].length == 0) {
                safeNodes.add(i);
            }
        }
        boolean changed = true;
        while(changed) {
            changed = false;
            for(int i = 0; i < graph.length; i++) {
                if(safeNodes.contains(i)) {
                    continue;
                }
                boolean oneVarNotInSafeNode = false;
                for(int j = 0; j < graph[i].length; j++) {
                    if(!safeNodes.contains(graph[i][j])) {
                        oneVarNotInSafeNode = true;
                        break;
                    }
                }
                if(oneVarNotInSafeNode) {

                } else {
                    safeNodes.add(i);
                    changed = true;
                }
            }
        }
        safeNodes.sort(Comparator.naturalOrder());
        return safeNodes;
    }
}
