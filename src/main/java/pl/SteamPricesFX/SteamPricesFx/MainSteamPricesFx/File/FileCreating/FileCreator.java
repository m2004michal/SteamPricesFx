package pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx.File.FileCreating;

import java.io.File;
import java.io.IOException;

    public class FileCreator {
        String fileName = "followedItems.txt";
        File file = new File(fileName);
        public boolean fileExists = file.exists();

        public void createFile() {
            if (!fileExists) {
                try {
                    fileExists = file.createNewFile();
                } catch (IOException e) {
                    System.out.println("Creating file failed");
                }
            }
            if (fileExists)
                System.out.println("File already exists");
        }
    }

