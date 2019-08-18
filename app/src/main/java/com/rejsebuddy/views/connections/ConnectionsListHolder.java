package com.rejsebuddy.views.connections;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.rejsebuddy.R;
import com.rejsebuddy.api.models.Connection;
import com.rejsebuddy.api.models.ConnectionStep;
import com.rejsebuddy.api.models.ConnectionStepPoint;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

class ConnectionsListHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    /**
     * The connection end time text view.
     */
    final private TextView end_time;

    /**
     * The connection start time text view.
     */
    final private TextView start_time;

    /**
     * The connection duration text view.
     */
    final private TextView duration;

    /**
     * The connection changes text view.
     */
    final private TextView changes;

    /**
     * Populates the layout element holders.
     *
     * @param view The contact row view.
     */
    ConnectionsListHolder(View view) {
        // Call view holder super.
        super(view);

        // Bind the view elements.
        this.changes = view.findViewById(R.id.changes);
        this.duration = view.findViewById(R.id.duration);
        this.end_time = view.findViewById(R.id.end_time);
        this.start_time = view.findViewById(R.id.start_time);

        // Bind single click listeners.
        view.setOnClickListener(this);
    }

    /**
     * Bind the row single click event.
     *
     * @param view The current view.
     */
    public void onClick(View view) {
        // TODO: Handle single tap
    }

    /**
     * Sets the contact details on the view.
     *
     * @param connection The list row connection.
     */
    public void setConnection(Connection connection) {
        // Skip if steps is empty.
        List<ConnectionStep> steps = connection.getSteps();
        if (steps.isEmpty()) return;

        // Get start and end step.
        ConnectionStepPoint start = steps.get(0).getOrigin();
        ConnectionStepPoint end = steps.get(steps.size() - 1).getDestination();

        // Prepare date hour and minute formatter.
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm", Locale.UK);

        // Get the current view context.
        Context ctx = this.itemView.getContext();

        // Set view text element text.
        this.end_time.setText(formatter.format(end.getDate()));
        this.start_time.setText(formatter.format(start.getDate()));
        this.changes.setText(ctx.getString(R.string.amount_changes, steps.size() - 1));
        this.duration.setText(ctx.getString(R.string.amount_duration, formatter.format(
            new Date(end.getDate().getTime() - start.getDate().getTime()))
        ));
    }
}
