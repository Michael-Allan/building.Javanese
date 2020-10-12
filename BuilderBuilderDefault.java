package building;

// Changes to this file immediately affect the next runtime.  Treat it as a script.

import java.nio.file.Path;


/** Default implementation of a builder builder.
  */
public class BuilderBuilderDefault implements BuilderBuilder {


    /** @see #projectPackage()
      * @see #projectPath()
      */
    public BuilderBuilderDefault( final String projectPackage, final Path projectPath ) {
        Bootstrap.i().verify( projectPackage );
        Bootstrap.i().verify( projectPath );
        Bootstrap.i().verify( projectPackage, projectPath );
        this.projectPackage = projectPackage;
        this.projectPath = projectPath; }



   // ━━━  B u i l d e r   B u i l d e r  ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━


    public final @Override String projectPackage() { return projectPackage; }


        private final String projectPackage;



    public final @Override Path projectPath() { return projectPath; }


        private final Path projectPath; }


                                                        // Copyright © 2020  Michael Allan.  Licence MIT.