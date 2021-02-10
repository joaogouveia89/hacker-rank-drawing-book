public class DrawingBook{
    static int pageCount(int n, int p) {
        int[] range = {0, 0};
        
        if(n % 2 == 0){
            if(n / 2 >= p){
                range[1] = p;
            }else{
                range[0] = p;
                range[1] = n;
            }
        }else{
            if(n / (float) 2 > p){
                range[0] = 1;
                range[1] = p;
            }else{
                range[0] = p;
                range[1] = n - 1;
            }
        }
        
        int diff = range[1] - range[0];
        
        return (range[0] == 0) ? (int)(Math.floor(diff / (float) 2)) : (int)(Math.ceil(diff / (float) 2));
    }
}