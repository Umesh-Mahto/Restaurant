package com.geekster.Restaurant.model;

public class RestaurantModel {
   private int Id;
    private String Name;
    private String Address;
    private String Specialty;
    private long Number;

    private int TotalStaff;

 public RestaurantModel(int id, String name, String address, String specialty, long number, int totalStaff) {
  Id = id;
  Name = name;
  Address = address;
  Specialty = specialty;
  Number = number;
  TotalStaff = totalStaff;
 }

 public int getId() {
  return Id;
 }

 public void setId(int id) {
  Id = id;
 }

 public String getName() {
  return Name;
 }

 public void setName(String name) {
  Name = name;
 }

 public String getAddress() {
  return Address;
 }

 public void setAddress(String address) {
  Address = address;
 }

 public String getSpecialty() {
  return Specialty;
 }

 public void setSpecialty(String specialty) {
  Specialty = specialty;
 }

 public long getNumber() {
  return Number;
 }

 public void setNumber(long number) {
  Number = number;
 }

 public int getTotalStaff() {
  return TotalStaff;
 }

 public void setTotalStaff(int totalStaff) {
  TotalStaff = totalStaff;
 }
}
