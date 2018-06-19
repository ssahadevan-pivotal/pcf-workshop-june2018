# Pivotal Cloud Foundry Environments

**Contents**
- [PCF Environments](#pcf-environment-information)
- [Logging into an environment](#logging-into-an-environment)
- [Marketplace information](#marketplace-information)

## PCF Environment Information
Use the following information to connect (login) to specific environments as directed by the instructor.

### Pivotal Web Services (PWS)
- Website: http://run.pivotal.io
- Endpoint: api.run.pivotal.io
- Username: Typically your email used when creating your PWS account
- Password: From your account
- Use [PWS Marketplace services](#pws-marketplace-services-and-plans) below

- Use [PCF Marketplace services](#gcp-marketplace-services-and-plans) below

### Backup environment ( if you do not have a PWS account )
- Website: https://login.run.haas-76.pez.pivotal.io/login
- Endpoint: api.run.haas-76.pez.pivotal.io
- Username: studentXX@workshop.com     where XX is 1 to 40 ie student1@workshop.com to student40@workshop.com
- Password: password

$ cf login -a api.run.haas-76.pez.pivotal.io -u studentXX@workshop.com --skip-ssl-validation

## Logging into an Environment
Using the above information, your step to login are as follows below. When logging in, PCF will ask you for your password and which PCF Space, i.e. development, test, or production, in which you would like to work. Spaces can always be changed later using `cf target -s test`, for instance.

```
$ cf login -a <endpoint> -u <user> --skip-ssl-validation
```

For PWS, use your email address from when you created your account.

```
$ cf login -a api.run.pivotal.io -u <myname@email.com> --skip-ssl-validation
API endpoint: api.run.pivotal.io

Password>
Authenticating...
OK


Select a space (or press enter to skip):
1. <cbusch>
2. <ssahadevan>
3. <cjett>
...

Space> 1
Targeted space development

API endpoint:   https://api.run.pivotal.io (API version: 2.54.0)
User:           cbusch@pivotal.io
Org:            <your default org>
Space:          cbusch
```


## Marketplace Information
Depending upon the PCF environment in which you are connected, the following Marketplace Services and Plans are available. For instance, if you are instructed to create a new 100mb MySQL service instance while using the PWS environment, then use the following:

```
$ cf create-service p-mysql 100mb mydb
```

### PWS MarketPlace Services and Plans
$ cf marketplace

  Will show you all services and plans available to your id, sample shown below.

Service Name | Plans | Description
------------ | ----- | -----------
app-autoscaler | bronze, gold | Scales bound applications in response to load (beta)
cleardb | spark, boost*, amp*, shock* | Highly available MySQL for your Apps.
cloudamqp | lemur, tiger*, bunny*, rabbit*, panda* | Managed HA RabbitMQ servers in the cloud
p-circuit-breaker-dashboard | standard | Circuit Breaker Dashboard for Spring Cloud Applications
p-config-server | standard | Config Server for Spring Cloud Applications
p-mysql | 100mb, 1gb, 20gb | MySQL databases on demand
p-service-registry | standard | Service Registry for Spring Cloud Applications
rediscloud | 100mb*, 250mb*, 500mb*, 1gb*, 2-5gb*, 5gb*, 10gb*, 50gb*, 30mb | Enterprise-Class Redis for Developers

[Course Materials home](/README.md#course-materials)
