package p018cn.sharesdk.framework.authorize;

import p018cn.sharesdk.framework.Platform;

/* renamed from: cn.sharesdk.framework.authorize.AuthorizeHelper */
public interface AuthorizeHelper {
    AuthorizeListener getAuthorizeListener();

    String getAuthorizeUrl();

    C0622b getAuthorizeWebviewClient(C0627g gVar);

    Platform getPlatform();

    String getRedirectUri();

    SSOListener getSSOListener();

    C0626f getSSOProcessor(C0625e eVar);
}
