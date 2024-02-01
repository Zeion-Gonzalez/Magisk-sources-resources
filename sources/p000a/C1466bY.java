package p000a;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: a.bY */
/* loaded from: classes.dex */
public final class C1466bY extends AbstractC2328ro implements InterfaceC0559KW {
    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1466bY(interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        AbstractC1292YB.m2664UZ(obj);
        String str = AbstractC0756O8.f2569z;
        AssetManager assetManager = (AssetManager) AssetManager.class.newInstance();
        Configuration configuration = new Configuration(AbstractC1743gn.m3275z().getResources().getConfiguration());
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setTo(AbstractC1743gn.m3275z().getResources().getDisplayMetrics());
        Resources resources = new Resources(assetManager, displayMetrics, configuration);
        String str2 = AbstractC0756O8.f2569z;
        if (str2 == null) {
            str2 = null;
        }
        AbstractC0756O8.m1730z(resources, str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add("en");
        arrayList.add("zh-TW");
        arrayList.add("pt-BR");
        arrayList.addAll(Arrays.asList(Resources.getSystem().getAssets().getLocales()));
        ArrayList arrayList2 = new ArrayList(AbstractC1658fB.m3134dx(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Locale.forLanguageTag((String) it.next()));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            resources.getConfiguration().setLocale((Locale) next);
            resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
            if (hashSet.add(resources.getString(R.string.app_changelog))) {
                arrayList3.add(next);
            }
        }
        List<Locale> m4296zd = AbstractC2486us.m4296zd(arrayList3, new C0823PM(0, C0582Ku.f1894w));
        resources.getConfiguration().setLocale(AbstractC1685fh.f5272h);
        resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
        String string = resources.getString(R.string.system_default);
        ArrayList arrayList4 = new ArrayList(m4296zd.size() + 1);
        ArrayList arrayList5 = new ArrayList(m4296zd.size() + 1);
        arrayList4.add(string);
        arrayList5.add("");
        for (Locale locale : m4296zd) {
            arrayList4.add(locale.getDisplayName(locale));
            arrayList5.add(locale.toLanguageTag());
        }
        C0084Bc c0084Bc = new C0084Bc(arrayList4.toArray(new String[0]), arrayList5.toArray(new String[0]));
        AbstractC1685fh.f5273v = c0084Bc;
        return c0084Bc;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        InterfaceC1725gU interfaceC1725gU = (InterfaceC1725gU) obj;
        return new C1466bY((InterfaceC1171Vv) obj2).mo50V(C0329GJ.f1115z);
    }
}
