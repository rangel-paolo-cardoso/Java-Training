package com.roomrent;

import java.util.Scanner;

import com.roomrent.entities.Room;

/**
 * RoomRent
 */
public class RoomRent {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("How many rooms will be rented? ");
    int numberOfRooms = sc.nextInt();

    Room[] room = new Room[numberOfRooms];

    for (int i = 0; i < room.length; i += 1) {
      System.out.print("\nRent #" + (i + 1));
      System.out.print("\nName: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Email: ");
      String email = sc.nextLine();
      System.out.print("Room: ");
      int roomNumber = sc.nextInt();
      room[i] = new Room(name, email, roomNumber);
    }

    System.out.println("Busy rooms:");
    for (int i = 0; i < room.length; i += 1) {
      System.out.println(room[i].toString());
    }

    sc.close();
  }
}