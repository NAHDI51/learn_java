public class hasBad {
    public boolean hasbad(String str) {
        if(str.length() < 3) {
            return false;
        } else if(str.length() == 3) {
            if(str.equals("bad")) {
                return true;
            } else {
                return false;
            }
        } else {
            // str.substring(start, end) -> [start, end)
            /*
                1. str.substring(l,r) always returns a STRING, not a boolean value
                    thus not a condition.
                2. To check comparison, use .equals("str") method
             */
            if(str.substring(0, 3).equals("bad") || str.substring(1, 1+3).equals("bad")) {
                return true;
            } else {
                return false;
            }
        }
    }
}
