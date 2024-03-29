/*
 * Copyright 2013 Niek Haarman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.haarman.listviewanimations.itemmanipulationexamples;

import android.app.Activity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
// import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;

import com.haarman.listviewanimations.R;

public class ItemManipulationsExamplesActivity extends Activity {

    @SuppressLint("InlinedApi")
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            getWindow().addFlags(android.view.WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examples_itemmanipulations);

        // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onDragAndDropClicked(final View view) {
        Intent intent = new Intent(this, DragAndDropActivity.class);
        startActivity(intent);
    }

    public void onSwipeDismissClicked(final View view) {
        Intent intent = new Intent(this, SwipeDismissActivity.class);
        startActivity(intent);
    }

    public void onAnimateRemovalClicked(final View view) {
        Intent intent = new Intent(this, AnimateDismissActivity.class);
        startActivity(intent);
    }

    public void onAnimateAdditionClicked(final View view) {
        Intent intent = new Intent(this, AnimateAdditionActivity.class);
        startActivity(intent);
    }

    public void onExpandListItemAdapterClicked(final View view) {
        Intent intent = new Intent(this, ExpandableListItemActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
