class DuplicateZerosSolution {
    public void duplicateZeros(int[] arr) {
        int f = arr.length;
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]!=0)
            {
                s.push(arr[i]);
                System.out.println("for non-zero: "+arr[i]);
            }
            else
            {
                s.push(arr[i]);
                System.out.println("for zeros: "+arr[i]);
                if(s.size()<arr.length){
                s.push(arr[i]);
                }
            }
            if(arr.length==s.size())
            {
                Object[] a = s.toArray();
                Integer[] l = Arrays.copyOf(a,f,Integer[].class);
                for (int x=0;x<l.length;x++) {
                	arr[x]=l[x];
                }
                break;
               
            }
        }
        
    }
}