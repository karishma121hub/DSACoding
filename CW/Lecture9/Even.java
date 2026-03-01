// class Even{
//     public static void even(){
//         for(int i =1;i<=1000;i++){
//             if (i%2==0){
//                 System.out.print(i + " ");
//             }
//         }
//     }
//     public static void main(String[]args){
      
//         even();
//     }
// }


class Even{
    public static int even(){
        int count =0;
        for(int i =1;i<=1000;i++){
            if (i%2==0){
                System.out.print(i + " ");
                count ++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        int result= even();
        System.out.print(result);
    }
}
