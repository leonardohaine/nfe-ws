//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.10.03 às 10:09:28 AM BRT 
//


package br.inf.portalfiscal.nfe.distDFeInt_v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;

import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.inf.portalfiscal.nfe.distDFeInt_v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private static final QName _DistDFeInt_QNAME = new QName("http://www.portalfiscal.inf.br/nfe", "distDFeInt");
	
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.inf.portalfiscal.nfe.distDFeInt_v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DistDFeInt }
     * 
     */
    public DistDFeInt createDistDFeInt() {
        return new DistDFeInt();
    }

    /**
     * Create an instance of {@link DistDFeInt.DistNSU }
     * 
     */
    public DistDFeInt.DistNSU createDistDFeIntDistNSU() {
        return new DistDFeInt.DistNSU();
    }

    /**
     * Create an instance of {@link DistDFeInt.ConsNSU }
     * 
     */
    public DistDFeInt.ConsNSU createDistDFeIntConsNSU() {
        return new DistDFeInt.ConsNSU();
    }

    /**
     * Create an instance of {@link DistDFeInt.ConsChNFe }
     * 
     */
    public DistDFeInt.ConsChNFe createDistDFeIntConsChNFe() {
        return new DistDFeInt.ConsChNFe();
    }

    @XmlElementDecl(namespace="http://www.portalfiscal.inf.br/nfe", name="distDFeInt")
    public JAXBElement<DistDFeInt> createDistDFeInt(DistDFeInt value)
    {
      return new JAXBElement(_DistDFeInt_QNAME, DistDFeInt.class, null, value);
    }
    
}
