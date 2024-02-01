package p000a;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: a.SR */
/* loaded from: classes.dex */
public @interface InterfaceC0983SR {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
