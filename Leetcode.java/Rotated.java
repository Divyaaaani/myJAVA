class Rotated {
    public boolean check(int[] A) {
        int count=0;
        for (int i=0; i<A.length;i++){
            if(A[i]>A[(i+1)%A.length])
            count++;
        }    
        return count<=1;
    }
}