# Pivotal Cloud Foundry (PCF) & Spring Workshop
## Pivotal Software and Perficient 
Join Pivotal and Perficient for a full-day hands-on workshop to introduce key concepts in modern cloud-native application development and delivery. This workshop will introduce concepts of cloud-native, Spring and .Net application development, container workload deployments with [Pivotal Cloud Foundry](https://pivotal.io/platform), as well as application monitoring with PCF Metrics and platform monitoring with PCF Healthwatch. The labs will leverage Spring Boot 2.0, Spring Actuator, Spring Cloud Data Flow for PCF, and other PCF 2.0 topics.

## Topics
- Cloud-native Architecture and Security
- PCF 2.0 with Pivotal Application Service (PAS) and Pivotal - Container Service (PKS) Overview
- Spring Boot 2.0 apps dev and Spring Actuator
- Application deployment on PAS
- Spring Cloud and Spring Cloud Data Flow (SCDF) for PCF
- Deploying an SCDF workflow to PCF
- Scaling Applications with Autoscaler and CLI
- Deploying container workloads to PKS

_This workshop is intended for: Managers, Architects, Developers, Operators and Infrastructure teams to learn about cloud-native architecture and Pivotal Cloud Foundry._


## Events of Interest
- Stay informed for the [2018 SpringOne Platform by Pivotal](https://springoneplatform.io/) to be held in Sept. 24-27 in Washington, D.C.


## Agenda

Time | Session
---- | -------
8:30 AM - 9:00 AM | _Registration and Breakfast_
9:00 AM - 9:15 AM | _Introductions, Logistics, Company Overviews_
9:15 AM - 9:45 AM | _Session 1: Cloud Native Architectures & Security_
9:45 AM - 10:30 AM | _Session 2: 12 Factor apps*_
10:30 AM - 10:45 AM | _Break_
10:45 AM - 11:15 AM | _Session 3: PCF Overview_
11:15 AM - 12:00 PM | _Session 4: PCF Application Deployment Labs_
12:00 PM - 1:00 PM | _Working Lunch with guest speaker - Project Experiences_
1:00 PM - 1:45 PM | _Session 5: Spring Boot and Actuator with Lab_
1:45 PM - 2:45 PM | _Session 6: Spring Cloud Data Flow on PCF with Lab_
2:45 PM - 3:00 PM | _Break_
3:00 PM - 3:45 PM | _Session 7: Scaling Apps with the new Autoscaler CLI with Lab_
3:45 PM - 4:10 PM | _Session 8: PCF Metrics and PCF Healthwatch Overview_
4:10 PM - 4:30 PM | _Wrap-up, Q&A, Course evaluation_

_*with Pivotal Application Service (PAS) and Pivotal Container Service (PKS)_

**Notes** 

> See [Course Materials](#course-materials) section below for slides and labs
>
> This is a _loose_ schedule for the day. We will adjust as necessary based on our pace through the material.
>
> The lectures for this workshop are generally light and are only intended to set the stage for the hands-on labs.
> The overwhelming majority of our time will be spent engaging with the technology directly!

## Getting started

**Prerequisites**

Start by downloading and installing the appropriate prerequisite tools.
- [Cloud Foundry CLI](https://goo.gl/M0pH4i) to interact with a cloud foundry instance
- [Apache Maven](http://info.pivotal.io/HI002010A6ZlRJR1NeU00eC) to build labs using Maven
- [Gradle](https://services.gradle.org/distributions/gradle-3.1-all.zip) to build labs using Gradle
- [Git Client](https://git-scm.com/downloads) to clone Github repo or download and unzip
- An IDE, like [Spring Tool Suite](https://spring.io/tools/sts/all) or [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
- [Java SE Development Kit](http://info.pivotal.io/n0I60i3021AN0JU0le10CRR)

**Download materials**

Next, download the course materials.  This can be accomplished either through the GitHub website by downloading a repository zip and unzipping locally, or if you have Git installed, use the following commands:

```
$ git clone https://github.com/ssahadevan-pivotal/pcf-workshop-june2018
$ cd pcf-workshop-june2018/
```

**PCF Environments**

Finally, in order to perform the labs, you must be connected or logged into a live PCF environment. Initially you were asked to create a Pivotal Web Services (PWS) account for use in labs and afterwards. Two other environments have also been made available for use. Please see the [Pivotal Cloud Foundry Environment document](common/env_info.md) for details. You should have been assigned a student number and PCF instance at registration. Otherwise the instructors will provide that information for your use.

## Course Materials

#### _Introductions, Logistics, Company Overviews_ [(Slides)](session_00/Session_Intro.pptx)

#### _Session 1: Cloud Native Architectures & Security_ [(Slides)](session_01/Session_01-Cloud_Native_Architectures_and_Security.pptx)

#### _Session 2: Developing 12 factor applications_ [(Slides)](https://github.com/fpmoles/talks-twelve-factor/blob/master/presentation/slides.pdf)

#### _Session 3: PCF Overview with PAS and PKS_ [(Slides)](session_02/Session_02-PCF-PAS-PKS-Overview.pptx)

#### _Session 4: PCF Application Deployment Labs_
  - [Lab 1 - From Zero to Pushing Your First Application](session_04/lab_01/lab_01.adoc)
  - [Lab 2 - Binding to Cloud Foundry Services](session_04/lab_02/lab_02.adoc)
  - [Lab 3 - Scaling Applications with Apps Manager](session_04/lab_03/lab_03.adoc)

#### _Lunch Session: Perficient_ [(Slides)](session_lunch/Session_Lunch-Monetization_Platform.pptx)

#### _Session 5: Spring Boot 2.0 and Actuator_ [(Slides)](session_05/Session_05-Spring-Boot-20-and-Actuator.pptx)
  - [Lab 4 - Spring Boot Actuator Lab](session_05/lab_04/lab_04.adoc) 

#### _Session 6: Spring Cloud Data Flow on PCF_ [(Slides)](session_06/Session_06-Spring-Cloud-Data-Flow.pptx)
  - [Lab 5 - Leveraging Spring Cloud Data Flow](session_06/lab_05/lab_05.adoc)

#### _Session 7: Scaling Apps with the new Autoscaler CLI_ [(Slides)](session_07/Session_07-Scaling-Apps-Autoscaler-CLI.pptx)
  - [Lab 6 - Using PCF Autoscaler](session_07/lab_06/lab_06.adoc)

#### _Session 8: PCF Metrics and PCF Healthwatch Overview_ [(Slides)](session_08/Session_08-PCF-Metrics-Healthwatch.pptx)

#### _Wrap-up, Q&A, Course evaluation_ [(Slides)](session_wrapup/Session_Wrap-Up.pptx)

## The Team

### Instructors
- **Rob Winch** - Pivotal -         Sr. Principle Software Engineer, rwinch@pivotal.io
- **Jonathan Regehr** - Garmin -    Software Engineer, Jonathan.Regehr@garmin.com
- **DaShaun Carter** - MedZero -    VP of Engineering / Lead Architect for MedZERO
- **Frank Moley** -   DataStax  -   Senior Software Engineer,frankmoley@gmail.com
- **Suhas Hangel** - Perficient -   Principle Architect, suhas.hangel@perficient.com
- **Sharath Sahadevan** - Pivotal - Platform Achitect, ssahadevan@pivotal.io

### Hosts
- **Dave Stockmann** - Perficient Director/Principle Architect, dave.stockmann@perficient.com
- **Jason Hudnall** - Perficient  General Manager, jason.hudnall@perficient.com
- **Brian Lock** - Pivotal Account Executive, bdlock@pivotal.io
- **Jason Foster** - Pivotal Account Executive, jfoster@pivotal.io
...
