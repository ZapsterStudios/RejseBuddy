package com.rejsebuddy.storage.contact;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Contact {

    /**
     * The id of the contact
     */
    @PrimaryKey
    private int id;

    /**
     * The name of the contact.
     */
    @ColumnInfo(name = "name")
    private String name;

    /**
     * The address of the contact.
     */
    @ColumnInfo(name = "address")
    private String address;

    /**
     * The address x position.
     */
    @ColumnInfo(name = "addrx")
    private int addrx;

    /**
     * The address y position.
     */
    @ColumnInfo(name = "addry")
    private int addry;

    /**
     * Initiates the model instance.
     *
     * @param name The name of the contact
     * @param address The address of the contact
     */
    public Contact(int id, String name, String address, int addrx, int addry) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.addrx = addrx;
        this.addry = addry;
    }

    /**
     * Returns the contact id.
     *
     * @return The id of the contact.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Returns the contact name.
     *
     * @return The name of the contact.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the contact name
     *
     * @param name The name of the contact.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the contact address.
     *
     * @return The address of the contact.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Sets the contact address
     *
     * @param address The address of the contact.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns the address x position.
     *
     * @return The address x position.
     */
    public int getAddrx() {
        return this.addrx;
    }

    /**
     * Sets the address x position.
     *
     * @param addrx The address x position.
     */
    public void setAddrx(int addrx) {
        this.addrx = addrx;
    }

    /**
     * Returns the address y position.
     *
     * @return The address y position.
     */
    public int getAddry() {
        return this.addry;
    }

    /**
     * Sets the address y position.
     *
     * @param addry The address y position.
     */
    public void setAddry(int addry) {
        this.addry = addry;
    }

}
