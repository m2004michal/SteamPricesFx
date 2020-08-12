package pl.SteamPricesFX.SteamPricesFx.File.FileCreating;

import java.io.File;
import java.io.IOException;

    public class FileCreator {
        private String fileName = "followedItems.txt";
        private File file = new File(fileName);
        private boolean fileExists = file.exists();

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

