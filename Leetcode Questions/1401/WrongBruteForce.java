class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        
        int[] c1 = {xCenter, yCenter + radius};
        int[] c2 = {xCenter + radius, yCenter};
        int[] c3 = {xCenter, yCenter - radius};
        int[] c4 = {xCenter - radius, yCenter};

        int[] r1 = {x1, y1}, r2 = {(2 * x1), y1}, r3 = {x2, y2}, r4 = {x1, (y1 * 2)};

        for(int up = r1[1]; up != r4[1]; up++){
            if(c1[0] == r1[0] && c1[1] == up)return true;
            
            if(c2[0] == r1[0] && c2[1] == up)return true;

            if(c3[0] == r1[0] && c3[1] == up)return true;

            if(c4[0] == r1[0] && c4[1] == up)return true;
        }

        for(int right = r4[0]; right != r3[0]; right++){
            if(c1[1] == r4[1] && c1[0] == right)return true;
            
            if(c2[1] == r4[1] && c2[0] == right)return true;

            if(c3[1] == r4[1] && c3[0] == right)return true;

            if(c4[1] == r4[1] && c4[0] == right)return true;
        }

        for(int down = r3[1]; down != r2[1]; down--){
            if(c1[0] == r3[0] && c1[1] == down)return true;
            
            if(c2[0] == r3[0] && c2[1] == down)return true;

            if(c3[0] == r3[0] && c3[1] == down)return true;

            if(c4[0] == r3[0] && c4[1] == down)return true;
        }

        for(int left = r2[0]; left != r1[0]; left--){
            if(c1[1] == r2[1] && c1[0] == left)return true;
            
            if(c2[1] == r2[1] && c2[0] == left)return true;

            if(c3[1] == r2[1] && c3[0] == left)return true;

            if(c4[1] == r2[1] && c4[0] == left)return true;
        }

        return false;
    }
}
