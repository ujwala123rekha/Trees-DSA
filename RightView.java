static ArrayList<Integer> leftView(Node root) {
    ArrayList<Integer> ans = new ArrayList<>();

    if (root == null) return ans;

    Queue<Node> q = new LinkedList<>();
    q.offer(root);

    while (!q.isEmpty()) {

        int size = q.size();

        for (int i = 0; i < size; i++) {

            Node curr = q.poll();

            if (i == size-1) {
                ans.add(curr.data);
            }

            if (curr.left != null)
                q.offer(curr.left);

            if (curr.right != null)
                q.offer(curr.right);
        }
    }

    return ans;
}
