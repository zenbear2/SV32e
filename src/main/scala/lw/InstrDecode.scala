package lw

import chisel3._
import chisel3.util._
import chisel3.util.experimental.decode._
import common.Consts._
import common.Instructions._

class InstrDecode extends Module{
    val io = IO(new Bundle{
        val inst = Input(UInt(WORD_LEN.W))
    })

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


// val csignals = decoder(inst, SignalTable)

// val exe_fun = csignals(19,15)
// val op1_sel = csignals(14,13)
// val op2_sel = csignals(12,10)
// val mem_wen = csignals(9,8)
// val rf_wen  = csignals(7,6)
// val wb_sel  = csignals(5,3)
// val csr_cmd = csignals(2,0)



}
