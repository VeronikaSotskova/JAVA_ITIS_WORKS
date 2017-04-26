package com.company;

import java.io.*;

public class TVImpl implements TV {
    private String fileName;

    public TVImpl(String fileName) {
        this.fileName = fileName;
    }

    public void addChannel(Channel channel) {
        try {
            OutputStream outputStream =
                    new FileOutputStream(fileName, true);
            outputStream.write((channel.toString() + "\n").getBytes());
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Exception in IO");
        }
        System.out.println("Channel " + channel.getName() + " add to list");
    }

    public Channel turnOnChannel(int number) {
        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));

            String currentChannelAsString = reader.readLine();

            while (currentChannelAsString != null) {
                String splitChannel[] = currentChannelAsString.split(" ");
                int channelNumber = Integer.parseInt(splitChannel[0]);
                String channelName = splitChannel[1];
                String channelProgram = splitChannel[2];
                if (channelNumber == number) {
                    System.out.println(channelProgram + " is playing on " + channelName);
                    reader.close();

                    return new Channel(channelNumber, channelName, channelProgram);
                }
                currentChannelAsString = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            return null;
        } catch (IOException e) {
            System.err.println("Exception in IO");
            return null;
        }
        return null;
    }


}
