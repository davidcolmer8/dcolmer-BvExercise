package com.dcolmer;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class BvExerciseApplication extends Application<BvExerciseConfiguration> {

    public static void main(final String[] args) throws Exception {
        new BvExerciseApplication().run(args);
    }

    @Override
    public String getName() {
        return "BvExercise";
    }

    @Override
    public void initialize(final Bootstrap<BvExerciseConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final BvExerciseConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
