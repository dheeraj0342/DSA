package com.dheeraj.DSA.Backtracking;

public class CrossWordPuzzle {
    public static void main(String[] args) {
        char[][] arr = {{'#','-','#'},{'-','-','-'},{'#','-','#'}};
        String[] words = {"and","ant"};
        int idx =0;
        crossWordPuzzle(arr,words,idx);
    }
    public static void crossWordPuzzle(char[][] arr , String[] words , int idx){
        if(idx==words.length){
            display(arr);
            return;
        }
        String word = words[idx];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]=='-' || arr[i][j]==word.charAt(0)){
                    if(canPlaceWordHorizontally(arr,word,i,j)){
                       boolean[] wePlaced= placeWordHorizontally(arr,word,i,j);
                        crossWordPuzzle(arr,words,idx+1);
                        unPlaceWordHorizontally(arr,i,j,wePlaced);
                    }
                    if(canPlaceWordVertically(arr,word,i,j)){
                        boolean[] wePlaced =placeWordVertically(arr,word,i,j);
                        crossWordPuzzle(arr,words,idx+1);
                        unPlaceWordVertically(arr,i,j,wePlaced);
                    }
                }

            }
        }
    }
    public static boolean canPlaceWordHorizontally(char[][] arr , String word , int i , int j){

        if(j-1>=0 && arr[i][j-1] !='#'){
            return false;
        }
        if(j+word.length() <arr[0].length && arr[i][j+word.length()] !='#'){
            return false;
        }
        for(int jj=0;jj<word.length();jj++){
            if(j+jj >=arr[0].length){
                return false;
            }
            if(arr[i][j+jj] !='-' || arr[i][j+jj]==word.charAt(jj)){
               continue;
            }else{
                return false;
            }
        }
        return true;
    }
    public static boolean[] placeWordHorizontally(char[][] arr , String word , int i  ,int j){
        boolean[] wePlaced = new boolean[word.length()];
        for(int jj =0 ;jj<word.length();jj++){
            if(arr[i][j+jj]=='-'){
                wePlaced[jj] = true;
                arr[i][j+jj] = word.charAt(jj);
            }
        }
        return wePlaced;
    }
    public static void unPlaceWordHorizontally(char[][] arr  , int i , int j, boolean[] wePlaced){
        for (int jj= 0;jj <wePlaced.length ; jj++) {
            if(wePlaced[jj]==true){
                arr[i][j+jj]='-';
            }
        }
    }

    public static boolean canPlaceWordVertically(char[][] arr , String word , int i ,int j){

        if(i-1>=0 && arr[i-1][j] != '#'){
            return false;
        }
        if(i+word.length() <arr.length && arr[i+word.length()][j] !='#'){
            return false;
        }
        for(int ii=0;ii<word.length();ii++){
            if(i+ii >=arr.length){
                return false;
            }
            if(arr[i+ii][j]=='-' || arr[i+ii][j]==word.charAt(ii)){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
    public static boolean[] placeWordVertically(char[][] arr , String word , int i,int j){
        boolean[] wePlaced = new boolean[word.length()];
        for(int ii=0;ii<word.length();ii++){
            if(arr[i+ii][j]=='-'){
                wePlaced[ii] = true;
                arr[i+ii][j] = word.charAt(ii);
            }
        }
        return wePlaced;
    }

    public static void unPlaceWordVertically(char[][] arr , int i , int j ,boolean[] wePlaced){
        for (int ii=0;ii<wePlaced.length;ii++){
            if(wePlaced[ii]==true){
                arr[i+ii][j]='-';
            }
        }
    }
    public static void display(char[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();
        }
    }

}
