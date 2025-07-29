public class Pal {
        public static void main(String[] args) {

            String s="abcabccbaaa";

            String longest="";

            for(int i=0;i<s.length();i++){

                for(int j=i;j<s.length();j++){

                    if(isPalindrom(s, i, j) && (j-i+1)>longest.length()){

                        longest = s.substring(i,j+1);

                    }

                }

            }

            System.out.println(longest);

        }

        public static boolean isPalindrom(String s, int prefix, int suffix){

            while(prefix<suffix){

                if(s.charAt(prefix)==s.charAt(suffix)){

                    prefix++;

                    suffix--;

                } else{

                    return false;

                }

            }

            return true;

        }

    }



