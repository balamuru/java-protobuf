package com.vgb.pb;

import com.google.protobuf.InvalidProtocolBufferException;
import com.vgb.pb.data.AddressBookProtos;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() throws InvalidProtocolBufferException {
        AddressBookProtos.AddressBook addressBook = AddressBookProtos.AddressBook.newBuilder().addPeople(
                AddressBookProtos.Person.newBuilder()
                        .setId(100)
                        .setName("Joe")
                        .setEmail("joe@gmail.com").build()
        ).build();

        //serialize / deserialize protobuf and print output
        assertEquals( addressBook, AddressBookProtos.AddressBook.parseFrom(addressBook.toByteArray()));
    }
}
