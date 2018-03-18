package com.kszr.sociallibrary.entity;

/**
 * A simulation of a person using a Thread.
 * 
 * @author abhishekchatterjee
 *
 */
public class Person extends Thread {
  private final String name;
  private final long id;

  private Person(final String name, final long id) {
    this.name = name;
    this.id = id;
  }
  
  public String getPersonName() {
    return name;
  }
  
  public long getPersonId() {
    return id;
  }
  
  /**
   * Tags a string with this Person's name and id for ease of
   * recognition.
   * 
   * @param s
   */
  public void print(String s) {
    System.out.println(name + " (" + id + ")" + ": " + s);
  }
  
  /**
   * A factory that manufactures Persons.
   * 
   * @author abhishekchatterjee
   *
   */
  public static class PersonFactory {
    private long id = 0;
    
    public Person buildPerson(String name) {
      return new Person(name, id++);
    }
  }

}