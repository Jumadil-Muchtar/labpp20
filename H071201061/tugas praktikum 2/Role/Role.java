class Role {
    public static void main(String[] args){
        int menuIndex =0;
        int subMenuIndex = 0;
        boolean isValidRole = false;
        
        if(args.length==0){
            System.out.println("What role you want to see ? ");
            System.out.println("For example, try 'Admin'");
        } else if (args.length==1){


            if (args[0].equals( "Super Admin") || args[0].equals("Admin") || args[0].equals("User")){
                switch (args[0]){
                    case "Super Admin" :
                        menuIndex++; subMenuIndex++;
                        System.out.printf("%d. Super Admin\n",menuIndex );
                        System.out.printf("%2d.%d CRUD  Super Admin\n", menuIndex, subMenuIndex);
                        System.out.printf("%2d.%d CRUD Admin\n", menuIndex, subMenuIndex);
                        System.out.printf("%2d.%d CRUD User\n", menuIndex, subMenuIndex);
    
    
    
                    case "Admin" :
                        menuIndex++; subMenuIndex++;
                        System.out.printf("%d. Admin\n", menuIndex);
                        System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
                        System.out.printf("%2d.%d.CRUD User\n", menuIndex, subMenuIndex);
    
                    
                    
                    default :
            
                        menuIndex++; subMenuIndex++;
                        System.out.printf("%d. User\n", menuIndex);
                        System.out.printf("%2d.%d. View\n", menuIndex, subMenuIndex);
                        System.out.printf("%2d.%d Edit\n", menuIndex, subMenuIndex);
                        
                }
            } else {
                System.out.println("Invalid Role");
                System.out.println("Valid Role: Super Admin, Admin, User");
            }  
        }else{
            System.out.println("Too many argument");
        } 
    }

}
