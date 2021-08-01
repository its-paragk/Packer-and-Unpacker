from Piyush Khairnar to everyone:    6:12 PM
hi
to Piyush Khairnar (privately):    6:12 PM
yes sir kela
to Piyush Khairnar (privately):    6:36 PM
yes
from Piyush Khairnar to everyone:    7:08 PM
import java.lang.*;
// For collection framework
import java.util.*;
// Fore directory traversal
import java.io.*;
// For file reading
import java.io.FileInputStream;
// For checksum
import java.security.MessageDigest;
class Demo
{
    public static void main(String arg[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter directory name");
        String dir = br.readLine();
        Cleaner cobj = new Cleaner(dir);
        // To remove empty files
        cobj.CleanDirectoryEmptyFile();
        // To remove duplicate files
        cobj.CleanDirectoryDuplicateFile();
    }
}

from Piyush Khairnar to everyone:    7:08 PM
class Cleaner
{
    public File fdir = null;
    public Cleaner(String name)
    {
        // Check the existance of directory
        fdir = new File(name);
        if(!fdir.exists())
        {
            System.out.println("Invalid Directory name");
            System.exit(0);
        }
    }
    public void CleanDirectoryEmptyFile()
    {
        File filelist[] = fdir.listFiles();
        int EmptyFile = 0;
        for(File file : filelist)
        {
            if(file.length() == 0)
            {
                System.out.println("Empty file name : "+file.getName());
                if(!file.delete())
                {
                    System.out.println("Unable to delete");
                }
                else
                {
                    EmptyFile++;
                }
            }
        }
        System.out.println("Total empty files deleted : "+ EmptyFile);
    }
    public void CleanDirectoryDuplicateFile() throws Exception
    {
        File filelist[] = fdir.listFiles();
        int DupFile = 0;
        // Bucket to read the data
        byte bytearr[] = new byte[1024];
        // Create linkedlist of strings 
        LinkedList<String> lobj = new LinkedList<String>();
        
        int Rcount = 0;
        try
        {
            MessageDigest digest = Messag
to Piyush Khairnar (privately):    7:17 PM
yes
from Piyush Khairnar to everyone:    7:34 PM
public void CleanDirectoryDuplicateFile() throws Exception
    {
        File filelist[] = fdir.listFiles();
        int DupFile = 0;
        // Bucket to read the data
        byte bytearr[] = new byte[1024];
        // Create linkedlist of strings 
        LinkedList<String> lobj = new LinkedList<String>();
        
        int Rcount = 0;
        try
        {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            if(digest == null)
            {
                System.out.println("Unable to get the MD5");
                System.exit(0);
            }
            for(File file : filelist)
            {
                FileInputStream fis = new FileInputStream(file);
                if(file.length() != 0)
                {
                    while((Rcount = fis.read(bytearr)) != -1)
                    {
                        digest.update(bytearr,0,Rcount);
                    }                                
                }
                // to get the hash bytes of cheksum
                byte bytes[] = digest.digest();
                StringBuilder sb = new StringBuilder();
                // Convert decimal hexadecimal format
                for(int i = 0; i < bytes.length; i++)
                {
                    sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
                }

to Piyush Khairnar (privately):    7:39 PM
yes
from Piyush Khairnar to everyone:    7:39 PM
hi
to Piyush Khairnar (privately):    7:48 PM
yes yetoy
from Piyush Khairnar to everyone:    7:55 PM
public void CleanDirectoryDuplicateFile() throws Exception
    {
        // List all files from directory
        File filelist[] = fdir.listFiles();
        // Counter to count number of duplicate files
        int DupFile = 0;
        // Bucket to read the data
        byte bytearr[] = new byte[1024];
        // Create linkedlist of strings to store the checksum
        LinkedList<String> lobj = new LinkedList<String>();
        
        // Counter to read the data from file
        int Rcount = 0;
        try
        {
            //Create object of message digest with algorithm MD5 (SHA)
            MessageDigest digest = MessageDigest.getInstance("MD5");
            
            if(digest == null)
            {
                System.out.println("Unable to get the MD5");
                System.exit(0);
            }
            // Foreach loop to travel the files array
            for(File file : filelist)
            {
                // Object to read the data from file
                FileInputStream fis = new FileInputStream(file);
                // if file is not empty
                if(file.length() != 0)
                {
                    // Read whole file in the part of 1024 bytes
                    while((Rcount = fis.read(bytear
to Piyush Khairnar (privately):    7:57 PM
yes sir