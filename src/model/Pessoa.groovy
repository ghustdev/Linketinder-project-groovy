package model

import groovy.transform.ToString

interface InterfacePessoa {
//    String getId()
    String getName()
    String getDescription()
    String getEmail()
    String getState()
    String getCep()
    List<String> getSkills()
}

abstract class Pessoa implements InterfacePessoa {

}