
package com.app.rc.GettingStartedWithHibernate.usingXmlConfiguration.services;


import java.util.List;


import com.app.rc.GettingStartedWithHibernate.usingXmlConfiguration.models.Student;


public interface StudentCrudOperations {

    public Student createStudentData ( );

    public int removeStudentData ( );

    public Student updateStudentData ( );

    public Student displayStudentData ( );

    public List< Student > getAllStudentData ( );
}
