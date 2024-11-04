package com.dheeraj.DSA.HashMap;

import java.util.HashMap;

public class CountSubstringWithKUniqueChar {
    public static void main(String[] args) {

    }
    public static void removeChar(HashMap<Character,Integer> map , char ch){
        if(map.get(ch)==1){
            map.remove(ch);
        }else{
            map.put(ch,map.get(ch)-1);
        }
    }
    public static int solutionFor1(String s){
        int ans =0;
        HashMap<Character,Integer> map = new HashMap<>();
        int i=-1;
        int j=-1;
        while(true){
            boolean f1 = false;
            boolean f2 = false;
            while(i<s.length()-1){
                f1 = true;
                i++;
                char ch = s.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(map.size()==2){
                    removeChar(map,ch);
                    break;
                }
            }
            while(j<i){
                f2 = true;
                if(map.size()==1){
                    ans += i-j;
                }
                j++;
                char ch = s.charAt(j);
                removeChar(map,ch);
                if(map.size() <1){
                    break;
                }

            }
            if(f1==false && f2 ==false){
                break;
            }

        }
        return ans;

    }
    public static int solution (String s , int k){
        if(k==1){
            return solutionFor1(s);
        }
        int ans =0;
        HashMap<Character,Integer> mapb = new HashMap<>();
        HashMap<Character,Integer> maps = new HashMap<>();
        int ib=-1;
        int is =-1;
        int j=-1;
        while(true){
            boolean f1 = false;
            boolean f2 = false;
            boolean f3 = false;

            while(ib < s.length()-1){
                f1 = true;
                ib++;
                char ch = s.charAt(ib);
                mapb.put(ch,mapb.getOrDefault(ch,0)+1);
                if(mapb.size()== k+1){
                    removeChar(mapb,ch);
                    ib--;
                    break;
                }
            }
            while(is < ib){
                f2 = true;
                is++;
                char ch = s.charAt(is);
                maps.put(ch,maps.getOrDefault(ch,0)+1);
                if(maps.size()==k){
                    removeChar(maps,ch);
                    is--;
                    break;
                }
            }
            while(j < is){
                f3 = true;
                if(maps.size()==k-1 && mapb.size()==k){
                    ans += ib-is;
                }
                j++;
                char ch = s.charAt(j);
                removeChar(maps,ch);
                removeChar(mapb,ch);
                if(maps.size() < k-1 || mapb.size()<k){
                    break;
                }
            }
            if(f1==false && f2 ==false && f3==false){
                break;
            }

        }
        return ans;
    }

}
