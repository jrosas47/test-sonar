
import java.io.File;
 
public class RenameFileExample 
{
    public static void main(String[] args)
    {	
 
		File oldfile =new File("D:/WBI/CHKNGOx9A09282012104331.payload");
		File newfile =new File("D:/WBI/CHKNGOx9A09282012104331.payload.pro");
 
		if(oldfile.renameTo(newfile)){
			System.out.println("Rename succesful");
		}else{
			System.out.println("Rename failed");
		}
 
    }
    
}