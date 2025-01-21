error id: ED080F6EA298489EA0D516712E799C41
file://<WORKSPACE>/src/main/scala/lw/Core.scala
### java.lang.IndexOutOfBoundsException: -1 is out of bounds (min 0, max 2)

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.15
Classpath:
<WORKSPACE>/.bloop/out/SV32e/bloop-bsp-clients-classes/classes-Metals-7sSWUumpTJmjU-nHgGCEjA== [exists ], <HOME>/.cache/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.10.3/semanticdb-javac-0.10.3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/chipsalliance/chisel_2.13/6.6.0/chisel_2.13-6.6.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.15/scala-library-2.13.15.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.13.15/scala-reflect-2.13.15.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/scopt/scopt_2.13/4.1.0/scopt_2.13-4.1.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/jcazevedo/moultingyaml_2.13/0.4.2/moultingyaml_2.13-0.4.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-native_2.13/4.0.6/json4s-native_2.13-4.0.6.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-text/1.10.0/commons-text-1.10.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/github/alexarchambault/data-class_2.13/0.2.6/data-class_2.13-0.2.6.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/os-lib_2.13/0.9.2/os-lib_2.13-0.9.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-parallel-collections_2.13/1.0.4/scala-parallel-collections_2.13-1.0.4.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/upickle_2.13/3.1.0/upickle_2.13-3.1.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/chipsalliance/firtool-resolver_2.13/1.3.0/firtool-resolver_2.13-1.3.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/nscala-time/nscala-time_2.13/2.22.0/nscala-time_2.13-2.22.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/yaml/snakeyaml/1.26/snakeyaml-1.26.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-core_2.13/4.0.6/json4s-core_2.13-4.0.6.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-native-core_2.13/4.0.6/json4s-native-core_2.13-4.0.6.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/geny_2.13/1.0.0/geny_2.13-1.0.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/ujson_2.13/3.1.0/ujson_2.13-3.1.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/upack_2.13/3.1.0/upack_2.13-3.1.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/upickle-implicits_2.13/3.1.0/upickle-implicits_2.13-3.1.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/dev/dirs/directories/26/directories-26.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/outr/scribe_2.13/3.13.0/scribe_2.13-3.13.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/get-coursier/coursier_2.13/2.1.8/coursier_2.13-2.1.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/joda-time/joda-time/2.10.1/joda-time-2.10.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/joda/joda-convert/2.2.0/joda-convert-2.2.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-ast_2.13/4.0.6/json4s-ast_2.13-4.0.6.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-scalap_2.13/4.0.6/json4s-scalap_2.13-4.0.6.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/thoughtworks/paranamer/paranamer/2.8/paranamer-2.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/upickle-core_2.13/3.1.0/upickle-core_2.13-3.1.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/outr/perfolation_2.13/1.2.9/perfolation_2.13-1.2.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/sourcecode_2.13/0.3.1/sourcecode_2.13-0.3.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-collection-compat_2.13/2.11.0/scala-collection-compat_2.13-2.11.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/outr/moduload_2.13/1.1.7/moduload_2.13-1.1.7.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/plokhotnyuk/jsoniter-scala/jsoniter-scala-core_2.13/2.13.5.2/jsoniter-scala-core_2.13-2.13.5.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/get-coursier/coursier-core_2.13/2.1.8/coursier-core_2.13-2.1.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/get-coursier/coursier-cache_2.13/2.1.8/coursier-cache_2.13-2.1.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/get-coursier/coursier-proxy-setup/2.1.8/coursier-proxy-setup-2.1.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/github/alexarchambault/concurrent-reference-hash-map/1.1.0/concurrent-reference-hash-map-1.1.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-xml_2.13/2.2.0/scala-xml_2.13-2.2.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/get-coursier/coursier-util_2.13/2.1.8/coursier-util_2.13-2.1.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/get-coursier/jniutils/windows-jni-utils/0.3.3/windows-jni-utils-0.3.3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/codehaus/plexus/plexus-archiver/4.9.0/plexus-archiver-4.9.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/codehaus/plexus/plexus-container-default/2.1.1/plexus-container-default-2.1.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/virtuslab/scala-cli/config_2.13/0.2.1/config_2.13-0.2.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/github/alexarchambault/windows-ansi/windows-ansi/0.0.5/windows-ansi-0.0.5.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/codehaus/plexus/plexus-utils/4.0.0/plexus-utils-4.0.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/codehaus/plexus/plexus-io/3.4.1/plexus-io-3.4.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/commons-io/commons-io/2.15.0/commons-io-2.15.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-compress/1.24.0/commons-compress-1.24.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/iq80/snappy/snappy/0.4/snappy-0.4.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/tukaani/xz/1.9/xz-1.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/luben/zstd-jni/1.5.5-10/zstd-jni-1.5.5-10.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/codehaus/plexus/plexus-classworlds/2.6.0/plexus-classworlds-2.6.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/xbean/xbean-reflect/3.7/xbean-reflect-3.7.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/fusesource/jansi/jansi/1.18/jansi-1.18.jar [exists ]
Options:
-language:reflectiveCalls -deprecation -feature -Xcheckinit -Yrangepos -Xplugin-require:semanticdb


action parameters:
uri: file://<WORKSPACE>/src/main/scala/lw/Core.scala
text:
```scala
package lw

import chisel3._
import chisel3.util._
import chisel3.util.experimental.decode._
import common.Consts._
import common.Instructions._


class Core extends Module {
  val io = IO(new Bundle {
    val imem = Flipped(new ImemPortIo())
    val dmem = Flipped(new DmemPortIo())
    val exit = Output(Bool())
    val gp   = Output(UInt(WORD_LEN.W))
  })

  val regfile = Mem(32, UInt(WORD_LEN.W))
  val csr_regfile = Mem(4096, UInt(WORD_LEN.W))


//**********************************
// Instruction Fetch (IF) Stage

  val pc_reg = RegInit(START_ADDR)
  io.imem.addr := pc_reg
  val inst = io.imem.inst

  val pc_plus4 = pc_reg + 4.U(WORD_LEN.W)
  val br_target = Wire(UInt(WORD_LEN.W))
  val br_flg = Wire(Bool())
  val jal_flg = (inst === JAL|| inst === JALR)
  val alu_out = Wire(UInt(WORD_LEN.W))

  val pc_next = MuxCase(pc_plus4, Seq(
    jal_flg -> alu_out,
    br_flg  -> br_target,
    (inst === ECALL) -> csr_regfile(0x305)
  ))

  pc_reg := pc_next
  

//**********************************
// Instruction Decode (ID) Stage

val rs1_addr = inst(19, 15)
val rs2_addr = inst(24, 20)
val wb_addr  = inst(11, 7)

val rs1_data = Mux((rs1_addr =/= 0.U(ADDR_LEN.W)), regfile(rs1_addr), 0.U(WORD_LEN.W))
val rs2_data = Mux((rs2_addr =/= 0.U(ADDR_LEN.W)), regfile(rs2_addr), 0.U(WORD_LEN.W))

val imm_i = inst(31, 20) // Extraction of offset[11:0].
val imm_i_sext = Cat(Fill(20, imm_i(11)), imm_i) //Sign extension of OFFSET.
val imm_s = Cat(inst(31,25), inst(11,7)) // Extraction of offset[11:5].
val imm_s_sext = Cat(Fill(20, imm_s(11)), imm_s) //Sign extension of OFFSET.
val imm_b = Cat(inst(31), inst(7), inst(30,25), inst(11,8)) // Extraction of offset[12|10:5|4:1|11].
val imm_b_sext = Cat(Fill(19, imm_b(11)), imm_b, 0.U(1.W)) //Sign extension of OFFSET.
val imm_j = Cat(inst(31), inst(19,12), inst(20), inst(30,21)) // Extraction of offset[20|10:1|11|19:12].
val imm_j_sext = Cat(Fill(11, imm_j(19)), imm_j, 0.U(1.W)) //Sign extension of OFFSET.
val imm_u = inst(31, 12) // Extraction of offset[31:12].
val imm_u_shifted = Cat(imm_u, Fill(12, 0.U(1.W))) //Shifted offset[31:12].
val imm_z = inst(19,15)
val imm_z_sext = Cat(Fill(27, 0.U(1.W)), imm_z) //Sign extension of OFFSET.


// val csignals = ListLookup(inst,
//              List(ALU_X    , OP1_RS1, OP2_RS2, MEN_X, REN_X, WB_X  , CSR_X),
//   Array(
//     LW    -> List(ALU_ADD  , OP1_RS1, OP2_IMI, MEN_X, REN_S, WB_MEM, CSR_X),
//     SW    -> List(ALU_ADD  , OP1_RS1, OP2_IMS, MEN_X, REN_X, WB_X  , CSR_X),
//     ADD   -> List(ALU_ADD  , OP1_RS1, OP2_RS2, MEN_X, REN_S, WB_ALU, CSR_X),
//     ADDI  -> List(ALU_ADD  , OP1_RS1, OP2_IMI, MEN_X, REN_S, WB_ALU, CSR_X),
//     SUB   -> List(ALU_SUB  , OP1_RS1, OP2_RS2, MEN_X, REN_S, WB_ALU, CSR_X),
//     AND   -> List(ALU_AND  , OP1_RS1, OP2_RS2, MEN_X, REN_S, WB_ALU, CSR_X),
//     OR    -> List(ALU_OR   , OP1_RS1, OP2_RS2, MEN_X, REN_S, WB_ALU, CSR_X),
//     XOR   -> List(ALU_XOR  , OP1_RS1, OP2_RS2, MEN_X, REN_S, WB_ALU, CSR_X),
//     ANDI  -> List(ALU_AND  , OP1_RS1, OP2_IMI, MEN_X, REN_S, WB_ALU, CSR_X),
//     ORI   -> List(ALU_OR   , OP1_RS1, OP2_IMI, MEN_X, REN_S, WB_ALU, CSR_X),
//     XORI  -> List(ALU_XOR  , OP1_RS1, OP2_RS2, MEN_X, REN_S, WB_ALU, CSR_X),
//     SLL   -> List(ALU_SLL  , OP1_RS1, OP2_RS2, MEN_X, REN_S, WB_ALU, CSR_X),
//     SRL   -> List(ALU_SRL  , OP1_RS1, OP2_RS2, MEN_X, REN_S, WB_ALU, CSR_X),
//     SRA   -> List(ALU_SRA  , OP1_RS1, OP2_RS2, MEN_X, REN_S, WB_ALU, CSR_X),
//     SLLI  -> List(ALU_SLL  , OP1_RS1, OP2_IMI, MEN_X, REN_S, WB_ALU, CSR_X),
//     SRLI  -> List(ALU_SRL  , OP1_RS1, OP2_IMI, MEN_X, REN_S, WB_ALU, CSR_X),
//     SRAI  -> List(ALU_SRA  , OP1_RS1, OP2_IMI, MEN_X, REN_S, WB_ALU, CSR_X),
//     SLT   -> List(ALU_SLT  , OP1_RS1, OP2_RS2, MEN_X, REN_S, WB_ALU, CSR_X),
//     SLTU  -> List(ALU_SLTU , OP1_RS1, OP2_RS2, MEN_X, REN_S, WB_ALU, CSR_X),
//     SLTI  -> List(ALU_SLT  , OP1_RS1, OP2_IMI, MEN_X, REN_S, WB_ALU, CSR_X),
//     SLTIU -> List(ALU_SLTU , OP1_RS1, OP2_RS2, MEN_X, REN_S, WB_ALU, CSR_X),
//     BEQ   -> List(BR_BEQ   , OP1_RS1, OP2_RS2, MEN_X, REN_X, WB_X  , CSR_X),
//     BNE   -> List(BR_BNE   , OP1_RS1, OP2_RS2, MEN_X, REN_X, WB_X  , CSR_X),
//     BGE   -> List(BR_BGE   , OP1_RS1, OP2_RS2, MEN_X, REN_X, WB_X  , CSR_X),
//     BGEU  -> List(BR_BGEU  , OP1_RS1, OP2_RS2, MEN_X, REN_X, WB_X  , CSR_X),
//     BLT   -> List(BR_BLT   , OP1_RS1, OP2_RS2, MEN_X, REN_X, WB_X  , CSR_X),
//     BLTU  -> List(BR_BLTU  , OP1_RS1, OP2_RS2, MEN_X, REN_X, WB_X  , CSR_X),
//     JAL   -> List(ALU_ADD  , OP1_PC , OP2_IMJ, MEN_X, REN_S, WB_PC , CSR_X),
//     JALR  -> List(ALU_JALR , OP1_RS1, OP2_IMI, MEN_X, REN_S, WB_PC , CSR_X),
//     LUI   -> List(ALU_ADD  , OP1_X  , OP2_IMU, MEN_X, REN_S, WB_ALU, CSR_X),
//     AUIPC -> List(ALU_ADD  , OP1_PC , OP2_IMU, MEN_X, REN_S, WB_ALU, CSR_X),
//     CSRRW -> List(ALU_COPY1, OP1_RS1, OP2_X  , MEN_X, REN_S, WB_CSR, CSR_W),
//     CSRRWI-> List(ALU_COPY1, OP1_IMZ, OP2_X  , MEN_X, REN_S, WB_CSR, CSR_W),
//     CSRRS -> List(ALU_COPY1, OP1_RS1, OP2_X  , MEN_X, REN_S, WB_CSR, CSR_S),
//     CSRRSI-> List(ALU_COPY1, OP1_IMZ, OP2_X  , MEN_X, REN_S, WB_CSR, CSR_S),
//     CSRRC -> List(ALU_COPY1, OP1_RS1, OP2_X  , MEN_X, REN_S, WB_CSR, CSR_C),
//     CSRRCI-> List(ALU_COPY1, OP1_IMZ, OP2_X  , MEN_X, REN_S, WB_CSR, CSR_C),
//     ECALL -> List(ALU_X    , OP1_X  , OP2_X  , MEN_X, REN_X, WB_X  , CSR_E)
//   ))


    val SignalTable = TruthTable(
    Map(
        LW    -> BitPat("00001000100001001000"),
        SW    -> BitPat("00001000110000000000"),
        ADD   -> BitPat("00001000010001000000"),
        ADDI  -> BitPat("00001000100001000000"),
        SUB   -> BitPat("00010000010001000000"),
        AND   -> BitPat("00011000010001000000"),
        OR    -> BitPat("00100000010001000000"),
        XOR   -> BitPat("00101000010001000000"),
        ANDI  -> BitPat("00011000100001000000"),
        ORI   -> BitPat("00100000100001000000"),
        XORI  -> BitPat("00101000100001000000"),
        SLL   -> BitPat("00110000010001000000"),
        SRL   -> BitPat("00111000010001000000"),
        SRA   -> BitPat("01000000010001000000"),
        SLLI  -> BitPat("00110000100001000000"),
        SRLI  -> BitPat("00111000100001000000"),
        SRAI  -> BitPat("01000000100001000000"),
        SLT   -> BitPat("01001000010001000000"),
        SLTU  -> BitPat("01010000010001000000"),
        SLTI  -> BitPat("01001000100001000000"),
        SLTIU -> BitPat("01010000010001000000"),
        BEQ   -> BitPat("01011000010000000000"),
        BNE   -> BitPat("01100000010000000000"),
        BGE   -> BitPat("01110000010000000000"),
        BGEU  -> BitPat("10000000010000000000"),
        BLT   -> BitPat("01101000010000000000"),
        BLTU  -> BitPat("01111000010000000000"),
        JAL   -> BitPat("00001011000001010000"),
        JALR  -> BitPat("10001000100001010000"),
        LUI   -> BitPat("00001101010001000000"),
        AUIPC -> BitPat("00001011010001000000"),
        CSRRW -> BitPat("10010000000001011001"),
        CSRRWI-> BitPat("10010110000001011001"),
        CSRRS -> BitPat("10010000000001011010"),
        CSRRSI-> BitPat("10010110000001011010"),
        CSRRC -> BitPat("10010000000001011011"),
        CSRRCI-> BitPat("10010110000001011011"),
        ECALL -> BitPat("00000100000000000100")
    ),BitPat("00000000000000000000")
    )



cs

val exe_fun :: op1_sel :: op2_sel :: mem_wen :: rf_wen :: wb_sel :: csr_cmd :: Nil = csignals




val op1_data = MuxCase(0.U(WORD_LEN.W), Seq(
  (op1_sel === OP1_RS1) -> rs1_data,
  (op1_sel === OP1_PC)  -> pc_reg,
  (op1_sel === OP1_IMZ) -> imm_z_sext
))

val op2_data = MuxCase(0.U(WORD_LEN.W), Seq(
  (op2_sel === OP2_RS2) -> rs2_data,
  (op2_sel === OP2_IMI) -> imm_i_sext,
  (op2_sel === OP2_IMS) -> imm_s_sext,
  (op2_sel === OP2_IMJ) -> imm_j_sext,
  (op2_sel === OP2_IMU) -> imm_u_shifted
))


//**********************************
// Execute (EX) Stage

alu_out := MuxCase(0.U(WORD_LEN.W), Seq(
  (exe_fun === ALU_ADD)  -> (op1_data + op2_data),
  (exe_fun === ALU_SUB)  -> (op1_data - op2_data),
  (exe_fun === ALU_AND)  -> (op1_data & op2_data),
  (exe_fun === ALU_OR)   -> (op1_data | op2_data),
  (exe_fun === ALU_XOR)  -> (op1_data ^ op2_data),
  (exe_fun === ALU_SLL)  -> (op1_data << op2_data(4,0))(31,0),
  (exe_fun === ALU_SRL)  -> (op1_data >> op2_data(4,0)).asUInt,
  (exe_fun === ALU_SRA)  -> (op1_data.asSInt >> op2_data(4,0)).asUInt,
  (exe_fun === ALU_SLT)  -> (op1_data.asSInt < op2_data.asSInt).asUInt,
  (exe_fun === ALU_SLTU) -> (op1_data < op2_data).asUInt,
  (exe_fun === ALU_JALR) -> ((op1_data + op2_data) & ~1.U(WORD_LEN.W)),
  (exe_fun === ALU_COPY1)-> op1_data
))


//branch
br_target := pc_reg + imm_b_sext
br_flg := MuxCase(false.B, Seq(
  (exe_fun === BR_BEQ)  -> (op1_data === op2_data),
  (exe_fun === BR_BNE)  -> (op1_data =/= op2_data),
  (exe_fun === BR_BLT)  -> (op1_data.asSInt < op2_data.asSInt),
  (exe_fun === BR_BGE)  -> (op1_data.asSInt >= op2_data.asSInt),
  (exe_fun === BR_BLTU) -> (op1_data < op2_data),
  (exe_fun === BR_BGEU) -> (op1_data >= op2_data)
))

//**********************************
//Memory (MEM) Stage

io.dmem.addr  := alu_out
io.dmem.wen   := mem_wen
io.dmem.wdata := rs2_data


//CSR
val csr_addr = Mux(csr_cmd === CSR_W, 0x342.U(CSR_ADDR_LEN.W), inst(31,20))
val csr_radata = csr_regfile(csr_addr)
val csr_wdata = MuxCase(0.U(WORD_LEN.W), Seq(
  (csr_cmd === CSR_W) -> op1_data,
  (csr_cmd === CSR_S) -> (csr_radata | op1_data),
  (csr_cmd === CSR_C) -> (csr_radata & ~op1_data),
  (csr_cmd === CSR_E) -> 11.U(WORD_LEN.W)
))

when(csr_cmd =/= CSR_X) {
  csr_regfile(csr_addr) := csr_wdata
}


//**********************************
// Writeback (WB) Stage

val wb_data = MuxCase(alu_out, Seq(
  (wb_sel === WB_MEM) -> io.dmem.rdata,
  (wb_sel === WB_CSR) -> csr_radata,
  (wb_sel === WB_PC)  -> pc_plus4
))

when(rf_wen === REN_S) {
  regfile(wb_addr) := wb_data
}




//**********************************
// Debug
  io.gp   := regfile(3)
  io.exit := (inst === 0x23222120.U(WORD_LEN.W))
  printf(p"pc_reg     : 0x${Hexadecimal(pc_reg)}\n")
  printf(p"inst       : 0x${Hexadecimal(inst)}\n")
  printf(p"gp         : ${regfile(3)}\n")
  printf(p"rs1_addr   : $rs1_addr\n")
  printf(p"rs2_addr   : $rs2_addr\n")
  printf(p"wb_addr    : $wb_addr\n")
  printf(p"rs1_data   : 0x${Hexadecimal(rs1_data)}\n")
  printf(p"rs2_data   : 0x${Hexadecimal(rs2_data)}\n")  
  printf(p"wb_data    : 0x${Hexadecimal(wb_data)}\n")
  printf(p"dmem.addr  : ${io.dmem.addr}\n")                 
  printf(p"dmem.rdata : ${io.dmem.rdata}\n")
  printf("---------\n")
}
```



#### Error stacktrace:

```
scala.collection.mutable.ArrayBuffer.apply(ArrayBuffer.scala:102)
	scala.reflect.internal.Types$Type.findMemberInternal$1(Types.scala:1030)
	scala.reflect.internal.Types$Type.findMember(Types.scala:1035)
	scala.reflect.internal.Types$Type.memberBasedOnName(Types.scala:661)
	scala.reflect.internal.Types$Type.member(Types.scala:625)
	scala.tools.nsc.typechecker.Contexts$SymbolLookup.nextDefinition$1(Contexts.scala:1447)
	scala.tools.nsc.typechecker.Contexts$SymbolLookup.apply(Contexts.scala:1521)
	scala.tools.nsc.typechecker.Contexts$Context.lookupSymbol(Contexts.scala:1287)
	scala.tools.nsc.typechecker.Typers$Typer.typedIdent$2(Typers.scala:5695)
	scala.tools.nsc.typechecker.Typers$Typer.typedIdentOrWildcard$1(Typers.scala:5789)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6262)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6320)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typed1$41(Typers.scala:5238)
	scala.tools.nsc.typechecker.Typers$Typer.silent(Typers.scala:713)
	scala.tools.nsc.typechecker.Typers$Typer.normalTypedApply$1(Typers.scala:5240)
	scala.tools.nsc.typechecker.Typers$Typer.typedApply$1(Typers.scala:5272)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6264)
	scala.tools.nsc.typechecker.Implicits$ImplicitSearch.typedImplicit1(Implicits.scala:869)
	scala.tools.nsc.typechecker.Implicits$ImplicitSearch.typedImplicit0(Implicits.scala:824)
	scala.tools.nsc.typechecker.Implicits$ImplicitSearch.scala$tools$nsc$typechecker$Implicits$ImplicitSearch$$typedImplicit(Implicits.scala:639)
	scala.tools.nsc.typechecker.Implicits$ImplicitSearch$ImplicitComputation.rankImplicits(Implicits.scala:1219)
	scala.tools.nsc.typechecker.Implicits$ImplicitSearch$ImplicitComputation.findBest(Implicits.scala:1260)
	scala.tools.nsc.typechecker.Implicits$ImplicitSearch.searchImplicit(Implicits.scala:1319)
	scala.tools.nsc.typechecker.Implicits$ImplicitSearch.bestImplicit(Implicits.scala:1716)
	scala.tools.nsc.typechecker.Implicits.inferImplicit1(Implicits.scala:112)
	scala.tools.nsc.typechecker.Implicits.inferImplicit(Implicits.scala:91)
	scala.tools.nsc.typechecker.Implicits.inferImplicit$(Implicits.scala:88)
	scala.meta.internal.pc.MetalsGlobal$MetalsInteractiveAnalyzer.inferImplicit(MetalsGlobal.scala:78)
	scala.tools.nsc.typechecker.Implicits.inferImplicitView(Implicits.scala:50)
	scala.tools.nsc.typechecker.Implicits.inferImplicitView$(Implicits.scala:49)
	scala.meta.internal.pc.MetalsGlobal$MetalsInteractiveAnalyzer.inferImplicitView(MetalsGlobal.scala:78)
	scala.tools.nsc.typechecker.Typers$Typer.inferView(Typers.scala:332)
	scala.tools.nsc.typechecker.Typers$Typer.adaptToMember(Typers.scala:1416)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$adaptToMemberWithArgs$6(Typers.scala:1465)
	scala.tools.nsc.typechecker.Typers$Typer.silent(Typers.scala:727)
	scala.tools.nsc.typechecker.Typers$Typer.adaptToMemberWithArgs(Typers.scala:1465)
	scala.tools.nsc.typechecker.Typers$Typer.typedSelect$1(Typers.scala:5481)
	scala.tools.nsc.typechecker.Typers$Typer.typedSelectOrSuperCall$1(Typers.scala:5636)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6265)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6320)
	scala.tools.nsc.typechecker.Typers$Typer.typedArg(Typers.scala:3562)
	scala.tools.nsc.typechecker.Typers$Typer.typedArg0$1(Typers.scala:3670)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$doTypedApply$7(Typers.scala:3689)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$doTypedApply$6(Typers.scala:3668)
	scala.tools.nsc.typechecker.Contexts$Context.savingUndeterminedTypeParams(Contexts.scala:551)
	scala.tools.nsc.typechecker.Typers$Typer.handleOverloaded$1(Typers.scala:3665)
	scala.tools.nsc.typechecker.Typers$Typer.doTypedApply(Typers.scala:3717)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typed1$28(Typers.scala:5171)
	scala.tools.nsc.typechecker.Typers$Typer.silent(Typers.scala:727)
	scala.tools.nsc.typechecker.Typers$Typer.tryTypedApply$1(Typers.scala:5171)
	scala.tools.nsc.typechecker.Typers$Typer.normalTypedApply$1(Typers.scala:5259)
	scala.tools.nsc.typechecker.Typers$Typer.typedApply$1(Typers.scala:5272)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6264)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6320)
	scala.tools.nsc.typechecker.Typers$Typer.typedArg(Typers.scala:3562)
	scala.tools.nsc.typechecker.Typers$Typer.handlePolymorphicCall$1(Typers.scala:3966)
	scala.tools.nsc.typechecker.Typers$Typer.doTypedApply(Typers.scala:3985)
	scala.tools.nsc.typechecker.Typers$Typer.normalTypedApply$1(Typers.scala:5261)
	scala.tools.nsc.typechecker.Typers$Typer.typedApply$1(Typers.scala:5272)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6264)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6320)
	scala.tools.nsc.typechecker.Typers$Typer.typedArg(Typers.scala:3562)
	scala.tools.nsc.typechecker.PatternTypers$PatternTyper.typedArgWithFormal$1(PatternTypers.scala:134)
	scala.tools.nsc.typechecker.PatternTypers$PatternTyper.$anonfun$typedArgsForFormals$4(PatternTypers.scala:150)
	scala.tools.nsc.typechecker.PatternTypers$PatternTyper.typedArgsForFormals(PatternTypers.scala:150)
	scala.tools.nsc.typechecker.PatternTypers$PatternTyper.typedArgsForFormals$(PatternTypers.scala:131)
	scala.tools.nsc.typechecker.Typers$Typer.typedArgsForFormals(Typers.scala:203)
	scala.tools.nsc.typechecker.Typers$Typer.handleMonomorphicCall$1(Typers.scala:3897)
	scala.tools.nsc.typechecker.Typers$Typer.doTypedApply(Typers.scala:3948)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typed1$28(Typers.scala:5171)
	scala.tools.nsc.typechecker.Typers$Typer.silent(Typers.scala:713)
	scala.tools.nsc.typechecker.Typers$Typer.tryTypedApply$1(Typers.scala:5171)
	scala.tools.nsc.typechecker.Typers$Typer.normalTypedApply$1(Typers.scala:5259)
	scala.tools.nsc.typechecker.Typers$Typer.typedApply$1(Typers.scala:5272)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6264)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6320)
	scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:6398)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$10(Typers.scala:3544)
	scala.tools.nsc.typechecker.Typers$Typer.typedStats(Typers.scala:3544)
	scala.tools.nsc.typechecker.Typers$Typer.typedTemplate(Typers.scala:2140)
	scala.tools.nsc.typechecker.Typers$Typer.typedClassDef(Typers.scala:1978)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6227)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6320)
	scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:6398)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$10(Typers.scala:3544)
	scala.tools.nsc.typechecker.Typers$Typer.typedStats(Typers.scala:3544)
	scala.tools.nsc.typechecker.Typers$Typer.typedPackageDef$1(Typers.scala:5901)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6230)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6320)
	scala.tools.nsc.typechecker.Analyzer$typerFactory$TyperPhase.apply(Analyzer.scala:125)
	scala.tools.nsc.Global$GlobalPhase.applyPhase(Global.scala:483)
	scala.tools.nsc.interactive.Global$TyperRun.applyPhase(Global.scala:1369)
	scala.tools.nsc.interactive.Global$TyperRun.typeCheck(Global.scala:1362)
	scala.tools.nsc.interactive.Global.typeCheck(Global.scala:680)
	scala.meta.internal.pc.Compat.$anonfun$runOutline$1(Compat.scala:57)
	scala.collection.IterableOnceOps.foreach(IterableOnce.scala:619)
	scala.collection.IterableOnceOps.foreach$(IterableOnce.scala:617)
	scala.collection.AbstractIterable.foreach(Iterable.scala:935)
	scala.meta.internal.pc.Compat.runOutline(Compat.scala:49)
	scala.meta.internal.pc.Compat.runOutline(Compat.scala:35)
	scala.meta.internal.pc.Compat.runOutline$(Compat.scala:33)
	scala.meta.internal.pc.MetalsGlobal.runOutline(MetalsGlobal.scala:36)
	scala.meta.internal.pc.ScalaCompilerWrapper.compiler(ScalaCompilerAccess.scala:19)
	scala.meta.internal.pc.ScalaCompilerWrapper.compiler(ScalaCompilerAccess.scala:14)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticTokens$1(ScalaPresentationCompiler.scala:195)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: -1 is out of bounds (min 0, max 2)