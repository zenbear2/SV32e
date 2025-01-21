package lw

import chisel3._
import common.Consts._
import _root_.circt.stage.ChiselStage

class Top extends Module {
  val io = IO(new Bundle {
    val exit = Output(Bool())
    val gp   = Output(UInt(WORD_LEN.W))
  })
  
  val core   = Module(new Core())
  val memory = Module(new Memory())


  core.io.imem <> memory.io.imem
  core.io.dmem <> memory.io.dmem
  
  io.exit := core.io.exit
  io.gp   := core.io.gp
}

object Elaborate_CPU extends App {
  val firtoolOptions = Array("--lowering-options=" + List(
    "disallowLocalVariables",
    "disallowPackedArrays",
    "locationInfoStyle=wrapInAtSquareBracket"
  ).reduce(_ + "," + _))
  circt.stage.ChiselStage.emitSystemVerilogFile(new Top(), args, firtoolOptions)
}

object Top extends App {
  ChiselStage.emitSystemVerilogFile(
    new Top,
    firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info")
  )
}