package p000a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;

/* renamed from: a.FP */
/* loaded from: classes.dex */
public final class C0284FP implements InterfaceC1376Zk {

    /* renamed from: z */
    public final /* synthetic */ int f988z;

    public /* synthetic */ C0284FP(int i) {
        this.f988z = i;
    }

    /* renamed from: z */
    public final Drawable m581z(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f988z) {
            case AbstractC0795Op.f2698E /* 0 */:
                try {
                    return C0224EF.m433N(context, theme, context.getResources(), attributeSet, xmlResourceParser);
                } catch (Exception e) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                    return null;
                }
            case 1:
                try {
                    Resources resources = context.getResources();
                    C1152VY c1152vy = new C1152VY(context);
                    c1152vy.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return c1152vy;
                } catch (Exception e2) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                    return null;
                }
            case 2:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) C0284FP.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    AbstractC2160ok.m3773v(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e3) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e3);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    C1430aq c1430aq = new C1430aq();
                    c1430aq.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return c1430aq;
                } catch (Exception e4) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e4);
                    return null;
                }
        }
    }
}
