<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xpath-default-namespace="http://nswi145/">
  <xsl:output method="text" encoding="UTF-8" indent="no"/>
  <xsl:variable name="prefix">http://nswi145/</xsl:variable>
  
  <xsl:template match="ForumContent">
    @prefix nswi: &lt;http://example.com/nswi145/&gt; .
    @prefix rdfs: &lt;http://www.w3.org/2000/01/rdf-schema#&gt; .
    @prefix sioc: &lt;http://rdfs.org/sioc/ns#&gt; .
    @prefix xsd: &lt;http://www.w3.org/2001/XMLSchema#&gt; .
    <xsl:apply-templates/>
    
  </xsl:template>
  
  <xsl:template match="Thread">
    <xsl:variable name="currentURI" select="concat($prefix, 'Thread/', @id)"/>
    &lt;<xsl:value-of select="$currentURI"/>&gt; a sioc:Thread ;
    rdfs:label &quot;<xsl:value-of select="Name"/>&quot;@<xsl:value-of select="Name/@xml:lang"/> .
    &lt;<xsl:value-of select="concat($prefix, 'User/', @author)"/>&gt; sioc:creator_of &lt;<xsl:value-of select="$currentURI"/>&gt; .
    
    <xsl:apply-templates select=".//Post">
      <xsl:with-param name="thread" select="$currentURI"/>
    </xsl:apply-templates>
  </xsl:template>
  
  <xsl:template match="Post">
    <xsl:param name="thread"/>
    
    <xsl:variable name="currentURI" select="concat($prefix, 'Post/', @id)"/>
    &lt;<xsl:value-of select="$currentURI"/>&gt; a sioc:Post ;
    sioc:content &quot;<xsl:value-of select="Content"/>&quot;@<xsl:value-of select="Content/@xml:lang"/> ;
    sioc:has_container &quot;<xsl:value-of select="$thread"/>&quot; .
    &lt;<xsl:value-of select="concat($prefix, 'User/', @author)"/>&gt; sioc:creator_of &lt;<xsl:value-of select="$currentURI"/>&gt; .
    
  </xsl:template>
  
  <xsl:template match="text()"/>
  
</xsl:stylesheet>
