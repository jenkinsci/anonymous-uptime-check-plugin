package io.jenkins.plugins.anonymousuptimecheck;

import hudson.Extension;
import hudson.model.UnprotectedRootAction;
import hudson.util.HttpResponses;
import jenkins.model.Jenkins;
import org.kohsuke.stapler.HttpResponse;

import javax.annotation.CheckForNull;

@Extension
public class AnonymousUptimeCheck implements UnprotectedRootAction {

    @CheckForNull
    public String getIconFileName() {
        return null;
    }

    @CheckForNull
    public String getDisplayName() {
        return Messages.displayName();
    }

    public HttpResponse doIndex() {
        if (Jenkins.getInstance().isQuietingDown()){
            return HttpResponses.status(503);
        }
        return HttpResponses.okJSON();
    }

    @CheckForNull
    public String getUrlName() {
        return "anonymousUptimeCheck";
    }
}
