package io.jenkins.plugins.quietdownendpoint;

import hudson.Extension;
import hudson.model.Api;
import hudson.model.UnprotectedRootAction;
import hudson.util.HttpResponses;
import jenkins.model.Jenkins;
import org.kohsuke.stapler.HttpResponse;
import org.kohsuke.stapler.export.Exported;
import org.kohsuke.stapler.export.ExportedBean;

import javax.annotation.CheckForNull;

@Extension
@ExportedBean
public class QuietDownEndpoint implements UnprotectedRootAction {

    @CheckForNull
    public String getIconFileName() {
        return null;
    }

    @CheckForNull
    public String getDisplayName() {
        return Messages.displayName();
    }

    public HttpResponse doIndex() {
        return HttpResponses.redirectTo("api");
    }

    @CheckForNull
    public String getUrlName() {
        return "quietDownStatus";
    }

    public Api getApi() {
        return new Api(this);
    }

    @Exported
    public boolean isQuietDown() {
        return Jenkins.getInstance().isQuietingDown();
    }
}
