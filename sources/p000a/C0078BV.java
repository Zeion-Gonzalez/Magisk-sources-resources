package p000a;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: a.BV */
/* loaded from: classes.dex */
public final class C0078BV implements InterfaceC1865j8 {

    /* renamed from: z */
    public final LocaleList f312z;

    public C0078BV(Object obj) {
        this.f312z = AbstractC2405tJ.m4142P(obj);
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.f312z.equals(((InterfaceC1865j8) obj).mo161z());
        return equals;
    }

    @Override // p000a.InterfaceC1865j8
    public final Locale get(int i) {
        Locale locale;
        locale = this.f312z.get(i);
        return locale;
    }

    @Override // p000a.InterfaceC1865j8
    /* renamed from: h */
    public final String mo160h() {
        String languageTags;
        languageTags = this.f312z.toLanguageTags();
        return languageTags;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f312z.hashCode();
        return hashCode;
    }

    @Override // p000a.InterfaceC1865j8
    public final boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.f312z.isEmpty();
        return isEmpty;
    }

    @Override // p000a.InterfaceC1865j8
    public final int size() {
        int size;
        size = this.f312z.size();
        return size;
    }

    public final String toString() {
        String localeList;
        localeList = this.f312z.toString();
        return localeList;
    }

    @Override // p000a.InterfaceC1865j8
    /* renamed from: z */
    public final Object mo161z() {
        return this.f312z;
    }
}
