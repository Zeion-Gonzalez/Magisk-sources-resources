package p000a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: a.FV */
/* loaded from: classes.dex */
public final class C0290FV extends MenuInflater {

    /* renamed from: N */
    public static final Class[] f1012N;

    /* renamed from: Q */
    public static final Class[] f1013Q;

    /* renamed from: P */
    public Object f1014P;

    /* renamed from: h */
    public final Object[] f1015h;

    /* renamed from: v */
    public final Context f1016v;

    /* renamed from: z */
    public final Object[] f1017z;

    static {
        Class[] clsArr = {Context.class};
        f1012N = clsArr;
        f1013Q = clsArr;
    }

    public C0290FV(Context context) {
        super(context);
        this.f1016v = context;
        Object[] objArr = {context};
        this.f1017z = objArr;
        this.f1015h = objArr;
    }

    /* renamed from: z */
    public static Object m603z(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? m603z(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public final void m604h(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i;
        char charAt;
        char charAt2;
        int i2;
        boolean z;
        AbstractC0219EA abstractC0219EA;
        ColorStateList colorStateList;
        C2622xK c2622xK = new C2622xK(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType != 1) {
                Menu menu2 = c2622xK.f8138z;
                if (eventType != i) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z3 && name2.equals(str)) {
                            z3 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            c2622xK.f8128h = 0;
                            c2622xK.f8135v = 0;
                            c2622xK.f8115P = 0;
                            c2622xK.f8114N = 0;
                            c2622xK.f8116Q = true;
                            c2622xK.f8134u = true;
                        } else if (name2.equals("item")) {
                            if (!c2622xK.f8130o) {
                                AbstractC0219EA abstractC0219EA2 = c2622xK.f8123Y;
                                if (abstractC0219EA2 != null && abstractC0219EA2.f692z.hasSubMenu()) {
                                    c2622xK.f8130o = true;
                                    c2622xK.m4521h(menu2.addSubMenu(c2622xK.f8128h, c2622xK.f8121W, c2622xK.f8109G, c2622xK.f8113M).getItem());
                                } else {
                                    c2622xK.f8130o = true;
                                    c2622xK.m4521h(menu2.add(c2622xK.f8128h, c2622xK.f8121W, c2622xK.f8109G, c2622xK.f8113M));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z2 = true;
                        }
                    }
                } else if (!z3) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C0290FV c0290fv = c2622xK.f8122X;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c0290fv.f1016v.obtainStyledAttributes(attributeSet, AbstractC0483J5.f1601I);
                        c2622xK.f8128h = obtainStyledAttributes.getResourceId(1, 0);
                        c2622xK.f8135v = obtainStyledAttributes.getInt(3, 0);
                        c2622xK.f8115P = obtainStyledAttributes.getInt(4, 0);
                        c2622xK.f8114N = obtainStyledAttributes.getInt(5, 0);
                        c2622xK.f8116Q = obtainStyledAttributes.getBoolean(2, true);
                        c2622xK.f8134u = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = c0290fv.f1016v;
                        C2709z9 c2709z9 = new C2709z9(context, context.obtainStyledAttributes(attributeSet, AbstractC0483J5.f1619q));
                        c2622xK.f8121W = c2709z9.m4646W(2, 0);
                        c2622xK.f8109G = (c2709z9.m4648o(5, c2622xK.f8135v) & (-65536)) | (c2709z9.m4648o(6, c2622xK.f8115P) & 65535);
                        c2622xK.f8113M = c2709z9.m4641M(7);
                        c2622xK.f8120V = c2709z9.m4641M(8);
                        c2622xK.f8118S = c2709z9.m4646W(0, 0);
                        String m4640G = c2709z9.m4640G(9);
                        if (m4640G == null) {
                            charAt = 0;
                        } else {
                            charAt = m4640G.charAt(0);
                        }
                        c2622xK.f8117R = charAt;
                        c2622xK.f8136w = c2709z9.m4648o(16, 4096);
                        String m4640G2 = c2709z9.m4640G(10);
                        if (m4640G2 == null) {
                            charAt2 = 0;
                        } else {
                            charAt2 = m4640G2.charAt(0);
                        }
                        c2622xK.f8111I = charAt2;
                        c2622xK.f8131q = c2709z9.m4648o(20, 4096);
                        if (c2709z9.m4645V(11)) {
                            i2 = c2709z9.m4652z(11, false);
                        } else {
                            i2 = c2622xK.f8114N;
                        }
                        c2622xK.f8129k = i2;
                        c2622xK.f8127g = c2709z9.m4652z(3, false);
                        c2622xK.f8137y = c2709z9.m4652z(4, c2622xK.f8116Q);
                        c2622xK.f8133s = c2709z9.m4652z(1, c2622xK.f8134u);
                        c2622xK.f8119U = c2709z9.m4648o(21, -1);
                        c2622xK.f8132r = c2709z9.m4640G(12);
                        c2622xK.f8108E = c2709z9.m4646W(13, 0);
                        c2622xK.f8126f = c2709z9.m4640G(15);
                        String m4640G3 = c2709z9.m4640G(14);
                        if (m4640G3 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && c2622xK.f8108E == 0 && c2622xK.f8126f == null) {
                            abstractC0219EA = (AbstractC0219EA) c2622xK.m4522z(m4640G3, f1013Q, c0290fv.f1015h);
                        } else {
                            if (z) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            abstractC0219EA = null;
                        }
                        c2622xK.f8123Y = abstractC0219EA;
                        c2622xK.f8112J = c2709z9.m4641M(17);
                        c2622xK.f8124c = c2709z9.m4641M(22);
                        if (c2709z9.m4645V(19)) {
                            c2622xK.f8125e = AbstractC1888jY.m3508v(c2709z9.m4648o(19, -1), c2622xK.f8125e);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            c2622xK.f8125e = null;
                        }
                        if (c2709z9.m4645V(18)) {
                            c2622xK.f8110H = c2709z9.m4647h(18);
                        } else {
                            c2622xK.f8110H = colorStateList;
                        }
                        c2709z9.m4651w();
                        c2622xK.f8130o = false;
                    } else if (name3.equals("menu")) {
                        c2622xK.f8130o = true;
                        SubMenu addSubMenu = menu2.addSubMenu(c2622xK.f8128h, c2622xK.f8121W, c2622xK.f8109G, c2622xK.f8113M);
                        c2622xK.m4521h(addSubMenu.getItem());
                        m604h(xmlResourceParser, attributeSet, addSubMenu);
                    } else {
                        str = name3;
                        z3 = true;
                    }
                }
                eventType = xmlResourceParser.next();
                i = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC1563dO)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f1016v.getResources().getLayout(i);
                    m604h(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
