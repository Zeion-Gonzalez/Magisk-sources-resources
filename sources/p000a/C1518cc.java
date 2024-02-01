package p000a;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;

/* renamed from: a.cc */
/* loaded from: classes.dex */
public final class C1518cc extends ContextWrapper {
    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createConfigurationContext(Configuration configuration) {
        Context createConfigurationContext = super.createConfigurationContext(configuration);
        AbstractC0756O8.m1729v(createConfigurationContext);
        return new C1518cc(createConfigurationContext);
    }
}
