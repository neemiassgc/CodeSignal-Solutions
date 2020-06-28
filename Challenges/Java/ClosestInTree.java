final class ClosestInTree {
    //
    // Binary trees are already defined with this interface:
    // class Tree<T> {
    //   Tree(T x) {
    //     value = x;
    //   }
    //   T value;
    //   Tree<T> left;
    //   Tree<T> right;
    // }
    void recTree(Tree<Integer> t, Vector<Integer> v) {
        v.add(t.value);
        if(t.left != null) recTree(t.left, v);
        if(t.right != null) recTree(t.right, v);
    }

    int btsTree(Tree<Integer> t, int n) {
        Vector<Integer> v = new Vector<>();
        
        recTree(t, v);
        
        v.sort((a, b) -> a.compareTo(b));
        
        int l = v.size();
        
        if(n >= v.get(l - 1)) return v.get(l - 1);
        if(n <= v.get(0)) return v.get(0);
        
        int mid = 0;
        
        for(int i = 0, j = l; i < j;) {
            mid = (i + j) / 2;
            
            if(v.get(mid) == n) return v.get(mid);
            
            if(n < v.get(mid)) {
                if(mid > 0 && n > v.get(mid - 1)) {
                   return getClosest(v.get(mid - 1), v.get(mid), n);
                }
                j = mid;
                continue;
            }
            
            if(mid < l - 1 && n < v.get(mid + 1)) {
                return getClosest(v.get(mid), v.get(mid + 1), n);
            }
            i = mid + 1;
        }
        
        return v.get(mid);
    }

    int getClosest(int n1, int n2, int i) {
        return i - n1 >= n2 - i ? n2 : n1;
    }

    int closestInTree(Tree<Integer> t, int n) {
        int o = btsTree(t, n);
        return o - 1 == n ? o - 2 : o;
    }
}