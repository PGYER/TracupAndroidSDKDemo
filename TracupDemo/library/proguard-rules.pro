# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /my/androidjava/software/android/sdk/android-sdk-macosx/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}
#
#-keepattributes InnerClasses
#-keepattributes Exceptions,Signature,Deprecated,SourceFile,LineNumberTable,*Annotation*
#-keepattributes EnclosingMethod
#-keepattributes Signature
#-optimizations !code/simplification/cast,!field/*,!class/merging/*
#-keep class android.support.** {*;}
#-keep class **.R$* {*;}
#
#-keep public class **Tracup {*;}
#-keep public class **Tracup$Builder {*;}
#
#
## RxJava RxAndroid
#-dontwarn sun.misc.**
#-dontwarn rx.internal.util.unsafe.**
#-keepclassmembers class rx.internal.util.unsafe.*ArrayQueue*Field* {
#    long producerIndex;
#    long consumerIndex;
#}
#-keepclassmembers class rx.internal.util.unsafe.BaseLinkedQueueProducerNodeRef {
#    rx.internal.util.atomic.LinkedQueueNode producerNode;
#}
#-keepclassmembers class rx.internal.util.unsafe.BaseLinkedQueueConsumerNodeRef {
#    rx.internal.util.atomic.LinkedQueueNode consumerNode;
#}
