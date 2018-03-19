package com.microsoft.test.embeddedsocial;

/**
 * Created by ssaroiu on 2/28/2018.
 */

public class Main {
    // Url to Embedded Social instance (use PPE for this example)
    private final static String ESUrl = "https://ppe.embeddedsocial.microsoft.com";

    public static void main(String[] args) {
        SyncExample syncExample = new SyncExample(ESUrl);
        AsyncExample asyncExample = new AsyncExample(ESUrl);
        BatchedExample batchedExample = new BatchedExample(ESUrl, 1);

        // syncExample makes single synchronous call
//        syncExample.run();

        // asyncExample makes single asynchronous call
//        asyncExample.run();

        // batchedExample makes single batched call
        batchedExample.run();
    }
}