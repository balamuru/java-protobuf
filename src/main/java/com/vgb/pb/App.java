package com.vgb.pb;

import com.google.protobuf.InvalidProtocolBufferException;
import com.vgb.pb.data.AddressBookProtos.AddressBook;
import com.vgb.pb.data.AddressBookProtos.Person;


/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws InvalidProtocolBufferException {
        AddressBook addressBook = AddressBook.newBuilder().addPeople(
            Person.newBuilder()
                    .setId(100)
                    .setName("Joe")
                    .setEmail("joe@gmail.com").build()
        ).build();

        //serialize / deserialize protobuf and print output
        System.out.println(AddressBook.parseFrom(addressBook.toByteArray()));
    }
}
