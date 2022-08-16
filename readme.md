**Spring Master Class**

```aidl

Spring design cycle supports loose coupling which enables us to quickly test our applications.

To do loose coupling dependency injection comes into picture.

we can be able to inform spring boot about all of the classes we have in our application.

This greatly helps you to use classes across the application whenever you want to without the need
to instantiate.

```

**Inversion of Control**

```aidl

Inversion of Control Concept


Is where we let spring worry about the instation of classes or the dependency injection.

Spring boot does the dependency injection for us and our work is just to inform spring.

Dependencies concept is how for instance classes need each other.(Spring boot comes up with a better
way to inject the dependencies of each class)

```


**Dependency Injection in Spring**


**Method One**

```aidl

Dependency Injection through XML.


```
```aidl

1.XML CONFIGURATION
 
 (POM XML FILE)
 
 Application context
 Bean Factory
 
 Application context extends bean factory.
 
 Whatever classes or Objects we are creating when doing xml dependency injection are called beans.
 
 Beans-are the classes and Objects that we are creating.
 

```

**Getting data from Beans**

```aidl


//        Doctor doctor = context.getBean(Doctor.class);
//        doctor.assist();

        //Getting values from type class
//        Nurse nurse = context.getBean(Nurse.class);
//        nurse.assist();

        //getting values as well from the id
        //i can also extract the class from the bean id
       

        //The Staff interface will work with whatever bean that has been passed
//        Staff staff = context.getBean(Doctor.class);
//        staff.assist();
```

**Injecting a class property to bean**
```aidl

We can as well inject the properties of a class to a Bean.

<bean id="doctor" class="demo.Doctor">
      <property name="qualification" value="MBBS">
      </property>
 </bean>
 
 
```

**Injecting an Object through the ref keyword**
```aidl

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">
   <bean id="doctor" class="demo.Doctor">
      <property name="qualification" value="MBBS">
      </property>
      <property name="nurse" ref="nurse"></property>
   </bean>

   <bean id="nurse" class="demo.Nurse"></bean>

</beans>
```

**Constructor Bean Injection**

```aidl
<bean id="doctor" class="demo.Doctor">

  <constructor-arg value="Electronic and Computer Engineering"></constructor-arg>
</bean>
```

**METHOD TWO**

```yaml

Annotation based dependeny injection.

It is a much shorter method.

i annotate my class with @component.

After i annotate my class, i specify my base package in my spring.xml.


```