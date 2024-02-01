package p000a;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.graphics.Path;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import com.topjohnwu.magisk.core.JobService;
import com.topjohnwu.magisk.core.download.DownloadService;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;

/* renamed from: a.Wm */
/* loaded from: classes.dex */
public class C1219Wm {

    /* renamed from: h */
    public static boolean f3987h;

    /* renamed from: z */
    public static Field f3988z;

    public C1219Wm() {
    }

    /* renamed from: N */
    public static Intent m2510N(Context context, AbstractC0164DB abstractC0164DB) {
        return new Intent().setComponent(AbstractC0756O8.m1728h(DownloadService.class, context.getPackageName())).putExtra("subject", abstractC0164DB);
    }

    /* renamed from: P */
    public static Path m2511P(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    /* renamed from: Q */
    public static Uri m2512Q(String str) {
        return new Uri.Builder().scheme("content").authority(str.concat(".provider")).path("prefs_file").build();
    }

    /* renamed from: W */
    public static void m2513W(AbstractActivityC0402He abstractActivityC0402He, AbstractC0164DB abstractC0164DB) {
        abstractActivityC0402He.m899q("android.permission.POST_NOTIFICATIONS", new C1372Zg(abstractActivityC0402He, 4, abstractC0164DB));
    }

    /* renamed from: u */
    public static void m2514u(Context context) {
        Object obj = AbstractC0865QC.f2950z;
        JobScheduler jobScheduler = (JobScheduler) AbstractC1375Zj.m2770h(context, JobScheduler.class);
        if (jobScheduler == null) {
            return;
        }
        if (C1212We.f3969z.m2502z()) {
            jobScheduler.schedule(new JobInfo.Builder(7, AbstractC0756O8.m1728h(JobService.class, context.getPackageName())).setPeriodic(TimeUnit.HOURS.toMillis(12L)).setRequiredNetworkType(1).setRequiresDeviceIdle(true).build());
        } else {
            jobScheduler.cancel(7);
        }
    }

    /* renamed from: v */
    public static C0536K5 m2515v(Bundle bundle) {
        Uri uri;
        bundle.setClassLoader(C0536K5.class.getClassLoader());
        if (!bundle.containsKey("action")) {
            throw new IllegalArgumentException("Required argument \"action\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("action");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("additional_data")) {
            uri = null;
        } else {
            if (!Parcelable.class.isAssignableFrom(Uri.class) && !Serializable.class.isAssignableFrom(Uri.class)) {
                throw new UnsupportedOperationException(Uri.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            uri = (Uri) bundle.get("additional_data");
        }
        return new C0536K5(uri, string);
    }

    /* renamed from: z */
    public static final void m2516z(float f, AbstractC0164DB abstractC0164DB) {
        C1112Up c1112Up = AbstractServiceC1020T7.f3413w;
        AbstractServiceC1020T7.f3413w.m2291M(new C0084Bc(Float.valueOf(f), abstractC0164DB));
    }

    /* renamed from: h */
    public float mo1716h(float f, float f2) {
        return 1.0f;
    }

    /* renamed from: o */
    public void mo2169o(View view, int i) {
        if (!f3987h) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f3988z = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f3987h = true;
        }
        Field field = f3988z;
        if (field != null) {
            try {
                f3988z.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public /* synthetic */ C1219Wm(AbstractC1050Tg abstractC1050Tg) {
    }

    public /* synthetic */ C1219Wm(Object obj) {
    }
}
