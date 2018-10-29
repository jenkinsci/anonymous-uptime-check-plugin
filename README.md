Anonymous Uptime Check Plugin
=====================

Allows unauthenticated access to check ability to run new jobs at `/anonymousUptimeCheck`.
If Jenkins is quieting down, the response is a `503`, otherwise a success `200` json repsonse.

This plugin can be used for external tools _(pingdom, uptrends, pagerduty, etc.)_ to check track uptime statics of Jenkins instance.

Building the Project
--------------------

### Dependencies
* [Apache Maven][maven] 3.0.4 or later

### Targets
```shell
  $ mvn clean install
```

Installing Plugin (Locally)
-------------------------
1. Build the project to produce `target/anonymous-uptime-check.hpi`
2. Copy `target/anonymous-uptime-check.hpi` to `$JENKINS_HOME/plugins/`
3. Start/Restart Jenkins
