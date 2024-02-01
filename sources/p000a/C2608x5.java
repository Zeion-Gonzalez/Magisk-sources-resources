package p000a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: a.x5 */
/* loaded from: classes.dex */
public final class C2608x5 extends C2196pM {
    public C2608x5() {
        super(6);
    }

    /* renamed from: f */
    public static Font m4488f(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int m4489r = m4489r(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int m4489r2 = m4489r(fontStyle, font2.getStyle());
            if (m4489r2 < m4489r) {
                font = font2;
                m4489r = m4489r2;
            }
        }
        return font;
    }

    /* renamed from: r */
    public static int m4489r(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p000a.C2196pM
    /* renamed from: I */
    public final Typeface mo135I(Context context, C0980SO[] c0980soArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        int i2;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C0980SO c0980so : c0980soArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(c0980so.f3311z, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor == null) {
                    }
                } else {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(c0980so.f3310v);
                        if (c0980so.f3308P) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        Font build = weight.setSlant(i2).setTtcIndex(c0980so.f3309h).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m4488f(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p000a.C2196pM
    /* renamed from: k */
    public final Typeface mo885k(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p000a.C2196pM
    /* renamed from: q */
    public final Typeface mo3819q(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p000a.C2196pM
    /* renamed from: w */
    public final Typeface mo136w(Context context, C1084UI c1084ui, Resources resources, int i) {
        int i2;
        try {
            FontFamily.Builder builder = null;
            for (C2474ub c2474ub : c1084ui.f3554z) {
                try {
                    Font.Builder weight = new Font.Builder(resources, c2474ub.f7577Q).setWeight(c2474ub.f7578h);
                    if (c2474ub.f7579v) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    Font build = weight.setSlant(i2).setTtcIndex(c2474ub.f7575N).setFontVariationSettings(c2474ub.f7576P).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m4488f(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p000a.C2196pM
    /* renamed from: y */
    public final C0980SO mo3821y(int i, C0980SO[] c0980soArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
