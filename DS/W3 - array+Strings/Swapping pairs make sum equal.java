boolean findSwapValues(int[] a, int[] b) {
    // Your code goes here
    int n1=a.length, n2 = b.length;

    int suma =0, sumb=0;

    for(int i : a) suma+=i;

    for(int i : b) sumb+=i;

    int diff = Math.abs(suma-sumb);
    if(diff==0) return true;
    if(diff%2 ==1 ) return false;

    if(suma< sumb){
        Set<Integer> s = new HashSet<>();
        for(int i : b)s.add(i);

        int adj = diff/2;

        for(int i : a){
            if(s.contains(i+adj)) return true;
        }
    } else{
        Set<Integer> s = new HashSet<>();
        for(int i : a) s.add(i);

        int adj = diff/2;

        for(int i : b){
            if(s.contains(i+adj)) return true;
        }
    }

    return false;
}